package Projeto;

import java.util.Random;

public class Conta {
// ATRIBUTOS COM ACESSO PRIVADO
   private int numeroConta;
   private int agencia;
   private double saldo;

// CONSTRUCTOR SEM ARGUMENTO
    public Conta(){
    this.numeroConta = gerarNumeroConta();
    this.agencia = 1701;
    }
// CONSTRUCTOR COM PARAMETROS
    public Conta( double saldo){

        this.numeroConta = gerarNumeroConta();
        this.agencia = 1701;
        this.saldo = saldo;
    }

    //

    private int  gerarNumeroConta(){
        Random random = new Random();
        int numeroContaGerado = random.nextInt(9000)+1000;
        return numeroContaGerado;
    }

    public int getNumeroConta(){
        return  numeroConta;
    }

    public int getAgencia(){
        return agencia;
    }

    public void retirar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public double getSaldo(){
        return saldo;
    }



}
