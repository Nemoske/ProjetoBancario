package Projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class RodandoMain {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();
        Scanner scanf = new Scanner(System.in);
        byte op;
        byte idade;
        String sn;
        double valor = 0;
        int agencia = 0;
        int numero = 0;
        boolean validacao = false;
        boolean serv = false;
        while (!validacao) {
            while (!serv) {
                System.out.println("BEM-VINDO AO BANCO FUTURISTA");
                System.out.println("SERVIÇO DISPONÍVEL:");
                System.out.println("Abertura de conta (1)");
                System.out.println("Serviços (2) ");
                System.out.println("Sair (3)");
                System.out.println("Digite o número do serviço:");
                op = scanf.nextByte();
                if (op == 1) {
                    validacao = true;
                    System.out.println("Qual tipo de conta você deseja abrir? ");
                    System.out.println("Conta corrente (1)");
                    System.out.println("Conta poupança (2)");
                    op = scanf.nextByte();
                    if (op == 1) {
                        System.out.println("Conta corrente selecionada");
                        System.out.println("Informe sua idade:");
                        idade = scanf.nextByte();
                        if (idade >= 18) {
                            System.out.println("Você está apto para criar uma conta corrente");
                            ContaCorrente ContaCorrente = new ContaCorrente();
                            contas.add(ContaCorrente);
                            System.out.println("Número da sua conta " + ContaCorrente.getNumeroConta());
                            System.out.println("Sua agência: " + ContaCorrente.getAgencia());
                            System.out.println("Comece a utiliza-la");
                            System.out.println("Digite sim caso queira olhar nossos serviços disponíveis");
                            System.out.println("Digite não, para sair");
                            sn = scanf.next();
                            if (sn.equals("sim") || sn.equals("SIM")) {
                                serv = true;
                                Menu.ExibirMenu();
                                op = scanf.nextByte();
                                if (op == 1) {
                                    System.out.println("Digite o número da sua conta e a agência por segurança:");
                                    System.out.println("Número da conta:");
                                    numero = scanf.nextInt();
                                    System.out.println("Número da agência:");
                                    agencia = scanf.nextInt();
                                    Conta contaEncontrada = null;
                                    for (Conta conta : contas) {

                                        if (conta.getNumeroConta() == numero && conta.getAgencia() == agencia) {
                                            contaEncontrada = conta;
                                            break;
                                        }
                                    }
                                    if (contaEncontrada == null) {
                                        System.out.println("Conta não encontrada!");
                                        return;
                                    }
                                    System.out.println("Digite o valor a ser depositado:");
                                    valor = scanf.nextDouble();
                                    contaEncontrada.depositar(valor);
                                    System.out.println("Depósito realizado com sucesso!");
                                    System.out.println("Saldo atual: " + contaEncontrada.getSaldo());
                                } else if (op == 2) {
                                    System.out.println("Digite o número da sua conta e a agência:");
                                    numero = scanf.nextInt();
                                    agencia = scanf.nextInt();
                                    Conta contaEncontrada = null;
                                    for (Conta conta : contas) {

                                        if (conta.getNumeroConta() == numero && conta.getAgencia() == agencia) {
                                            contaEncontrada = conta;
                                            break;
                                        }
                                    }
                                    if (contaEncontrada == null) {
                                        System.out.println("Conta não encontrada!");
                                        return;
                                    }
                                    System.out.println("Digite o valor a ser sacado:");
                                    valor = scanf.nextDouble();
                                    if (valor <= contaEncontrada.getSaldo() && valor > 0) {
                                        contaEncontrada.retirar(valor);
                                        System.out.println("Saque realizado com sucesso!");
                                        System.out.println("Saldo atual: " + contaEncontrada.getSaldo());
                                    } else {
                                        System.out.println("Não é possível realizar o saque.");
                                    }
                                }
                            } else {
                                System.out.println("SAINDO...");
                            }
                        } else {
                            System.out.println("Erro você é menor de idade para criar");
                        }
                    } else if (op == 2) {
                        System.out.println("Conta poupança selecionada");
                        System.out.println("Informe sua idade:");
                        idade = scanf.nextByte();
                        if (idade >= 18) {
                            System.out.println("Você está apto para criar uma conta corrente");
                            Conta ContaPoupanca = new ContaPoupanca();
                            System.out.println("Número da sua conta " + ContaPoupanca.getNumeroConta());
                            System.out.println("Sua agência: " + ContaPoupanca.getAgencia());
                            contas.add(ContaPoupanca);
                            System.out.println("Comece a utiliza-la");
                            System.out.println("Digite sim caso queira olhar nossos serviços disponíveis");
                            System.out.println("Digite não, para sair");
                            sn = scanf.next();
                            if (sn.equals("sim") || sn.equals("SIM")) {
                                serv = true;
                                Menu.ExibirMenu();
                                op = scanf.nextByte();
                                if (op == 1) {
                                    System.out.println("Digite o número da sua conta e a agência por segurança:");
                                    System.out.println("Número da conta:");
                                    numero = scanf.nextInt();
                                    System.out.println("Número da agência:");
                                    agencia = scanf.nextInt();
                                    Conta contaEncontrada = null;
                                    for (Conta conta : contas) {

                                        if (conta.getNumeroConta() == numero && conta.getAgencia() == agencia) {
                                            contaEncontrada = conta;
                                            break;
                                        }
                                    }
                                    if (contaEncontrada == null) {
                                        System.out.println("Conta não encontrada!");
                                        return;
                                    }
                                    System.out.println("Digite o valor a ser depositado:");
                                    valor = scanf.nextDouble();
                                    contaEncontrada.depositar(valor);
                                    System.out.println("Depósito realizado com sucesso!");
                                    System.out.println("Saldo atual: " + contaEncontrada.getSaldo());
                                } else if (op == 2) {
                                    System.out.println("Digite o número da sua conta e a agência por segurança:");
                                    System.out.println("Número da conta:");
                                    numero = scanf.nextInt();
                                    System.out.println("Número da agência:");
                                    agencia = scanf.nextInt();
                                    Conta contaEncontrada = null;
                                    for (Conta conta : contas) {

                                        if (conta.getNumeroConta() == numero && conta.getAgencia() == agencia) {
                                            contaEncontrada = conta;
                                            break;
                                        }
                                    }
                                    if (contaEncontrada == null) {
                                        System.out.println("Conta não encontrada!");
                                        return;
                                    }
                                    System.out.println("Digite o valor a ser sacado:");
                                    valor = scanf.nextDouble();
                                    if (valor <= contaEncontrada.getSaldo() && valor > 0) {
                                        contaEncontrada.retirar(valor);
                                        System.out.println("Saque realizado com sucesso!");
                                        System.out.println("Saldo atual: " + contaEncontrada.getSaldo());
                                    } else {
                                        System.out.println("Não é possível realizar o saque.");
                                    }
                                }
                            } else {
                                System.out.println("SAINDO...");
                            }
                        } else {
                            System.out.println("Erro você é menor de idade para criar");
                        }
                    }
                } else if (op == 2) {
                    serv = true;

                    Menu.ExibirMenu();
                    op = scanf.nextByte();
                    if (op == 1) {
                        System.out.println("Digite o número da sua conta e a agência:");
                        System.out.println("Número da conta:");
                        numero = scanf.nextInt();
                        System.out.println("Número da agência:");
                        agencia = scanf.nextInt();
                        Conta contaEncontrada = null;
                        for (Conta conta : contas) {

                            if (conta.getNumeroConta() == numero && conta.getAgencia() == agencia) {
                                contaEncontrada = conta;
                                break;
                            }
                        }
                        if (contaEncontrada == null) {
                            System.out.println("Conta não encontrada!");
                            return;
                        }
                        System.out.println("Digite o valor a ser depositado:");
                        valor = scanf.nextDouble();
                        contaEncontrada.depositar(valor);
                        System.out.println("Depósito realizado com sucesso!");
                        System.out.println("Saldo atual: " + contaEncontrada.getSaldo());
                    } else if (op == 2) {
                        System.out.println("Digite o número da sua conta e a agência:");
                        System.out.println("Número da conta:");
                        numero = scanf.nextInt();
                        System.out.println("Número da agência:");
                        agencia = scanf.nextInt();
                        Conta contaEncontrada = null;
                        for (Conta conta : contas) {

                            if (conta.getNumeroConta() == numero && conta.getAgencia() == agencia) {
                                contaEncontrada = conta;
                                break;
                            }
                        }
                        if (contaEncontrada == null) {
                            System.out.println("Conta não encontrada!");
                            return;
                        }
                        System.out.println("Digite o valor a ser sacado:");
                        valor = scanf.nextDouble();
                        if (valor <= contaEncontrada.getSaldo() && valor > 0) {
                            contaEncontrada.retirar(valor);
                            System.out.println("Saque realizado com sucesso!");
                            System.out.println("Saldo atual: " + contaEncontrada.getSaldo());
                        } else {
                            System.out.println("Não é possível realizar o saque.");
                        }

                    }
                } else if (op == 3) {
                    System.out.println("Obrigado por utilizar.");
                    System.exit(0);
                } else {
                    System.out.println("Opção invalida, tente novamente.");
                }
            }
        }
    }
}




