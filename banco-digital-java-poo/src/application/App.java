package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;
import entities.Cliente;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Banco banco = new Banco("LucasBank");

        criarContasIniciais(banco);

        menu(banco, sc);

        sc.close();

    }

    private static void menu(Banco banco, Scanner sc) {
        int op = 0;
        do {

            System.out.println("1 - Listar contas");
            System.out.println("2 - Criar Conta");
            System.out.println("3 - Fazer deposito");
            System.out.println("4 - Fazer transferencia");
            System.out.println("5 - Fazer saque");
            System.out.println("6 - Listar Contas Corrente");
            System.out.println("7 - Listar Contas Poupanca");
            System.out.println("0 - Sair");
            System.out.print("Digite a opcao desejada: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    banco.exibirContas();
                    break;
                case 2:
                    optionCriarConta(banco, sc);
                    break;

                case 3:
                    optionFazerDeposito(banco, sc);
                    break;

                case 4:
                    optionFazerTransferencia(banco, sc);
                    break;

                case 5:
                    optionFazerSaque(banco, sc);
                    break;
                case 6:
                    banco.exibirContasCorrente();
                    break;

                case 7:
                    banco.exibirContasPoupanca();
                    break;

                case 0:
                    System.out.println("Sistema Finalizado!");
                    break;

                default:
                    System.out.println("Opcao Invalida, tente novamente!");
                    break;
            }
        } while (op != 0);
    }

    private static void criarContasIniciais(Banco banco) {
        banco.adicionarConta(new ContaCorrente(new Cliente("Lucas Xavier")));
        banco.adicionarConta(new ContaPoupanca(new Cliente("Rebeca Rodrigues")));
        banco.depositarService(1000d, 1);
    }

    private static void optionFazerSaque(Banco banco, Scanner sc) {
        System.out.print("Digite a conta para fazer saque: ");
        int numero = sc.nextInt();
        System.out.print("Digite o valor para sacar: ");
        double valor = sc.nextDouble();
        banco.sacarService(valor, numero);
        System.out.println("Saque realizado com sucesso");
    }

    private static void optionFazerTransferencia(Banco banco, Scanner sc) {
        System.out.print("Digite o numero da conta de Origem: ");
        Integer numeroContaOrigem = sc.nextInt();
        System.out.print("Digite o numero da conta de Destino: ");
        Integer numeroContaDestino = sc.nextInt();
        System.out.print("Digite o valor a ser transferido: ");
        Double valor = sc.nextDouble();
        banco.transferirService(numeroContaOrigem, numeroContaDestino, valor);
        System.out.println("Transferencia realizada com sucesso!");
    }

    private static void optionFazerDeposito(Banco banco, Scanner sc) {
        System.out.print("Digite o numero da conta para deposito: ");
        int numero = sc.nextInt();
        System.out.print("Digite o valor do deposito: ");
        Double valor = sc.nextDouble();
        banco.depositarService(valor, numero);
        System.out.println("Deposito realizado com sucesso!");
    }

    private static void optionCriarConta(Banco banco, Scanner sc) {
        System.out.print("Digite o nome do cliente: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Tipo de Conta - 1 p/ Conta Corrente | 2 p/ Conta Poupanca: ");
        int tipo = sc.nextInt();

        if (tipo == 1) {
            banco.adicionarConta(new ContaCorrente(new Cliente(nome)));
            System.out.println("Conta corrente criada com sucesso!");
        } else if (tipo == 2) {
            banco.adicionarConta(new ContaPoupanca(new Cliente(nome)));
            System.out.println("Conta poupanca criada com sucesso!");
        } else {
            System.out.println("Opcao de conta invalida!");
        }
    }

}
