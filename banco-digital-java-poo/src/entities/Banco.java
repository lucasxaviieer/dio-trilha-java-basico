package entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta novaConta) {
        contas.add(novaConta);
    }

    public void removerConta(Integer numero) {
        Conta contaPesq;
        if (!contas.isEmpty()) {
            contaPesq = contas.stream().filter(x -> x.getNumero() == numero).findFirst().orElse(null);
            if (contaPesq != null) {
                contas.remove(contaPesq);
            } else {
                throw new RuntimeException("Conta inexistente!");
            }
        } else {
            System.out.println("Lista de conta vazia!");
        }

    }

    public void exibirContas() {
        contas.forEach(System.out::println);
    }

    public void depositarService(Double valor, Integer numero) {
        Conta contaPesq;
        if (!contas.isEmpty()) {
            contaPesq = contas.stream().filter(x -> x.getNumero() == numero).findFirst().orElse(null);
            if (contaPesq != null) {
                contaPesq.depositar(valor);
            } else {
                throw new RuntimeException("Nao existe nenhuma conta com esse numero!");
            }
        } else {
            System.out.println("Lista de conta vazia!");
        }
    }

    public void transferirService(Integer origem, Integer destino, Double valor) {
        Conta contaPesqDestino;
        Conta contaPesqOrigem;
        if (!contas.isEmpty()) {
            contaPesqOrigem = contas.stream().filter(x -> x.getNumero() == origem).findFirst().orElse(null);
            contaPesqDestino = contas.stream().filter(x -> x.getNumero() == destino).findFirst().orElse(null);
            if (contaPesqOrigem != null && contaPesqDestino != null) {
                contaPesqOrigem.transferir(valor, contaPesqDestino);
            } else {
                throw new RuntimeException("Numero de conta invalidos!");
            }
        } else {
            System.out.println("Lista de conta vazia!");
        }
    }

    public void sacarService(Double valor, Integer numero) {
        Conta contaPesq;
        if (!contas.isEmpty()) {
            contaPesq = contas.stream().filter(x -> x.getNumero() == numero).findFirst().orElse(null);
            if (contaPesq != null) {
                contaPesq.sacar(valor);
            } else {
                throw new RuntimeException("Conta inexistente!");
            }
        } else {
            System.out.println("Lista de conta vazia!");
        }
    }

    public void exibirContasPoupanca() {
        if (!contas.isEmpty()) {
            int controle = 0;
            for (Conta c : contas) {
                if (c instanceof ContaPoupanca) {
                    System.out.println(c);
                    controle++;
                }
            }
            if (controle == 0) {
                System.out.println("Nao há contas poupanca cadastradas!");
            }
        } else {
            System.out.println("Ainda nao existem contas cadastradas!");
        }
    }

    public void exibirContasCorrente() {
        if (!contas.isEmpty()) {
            int controle = 0;
            for (Conta c : contas) {
                if (c instanceof ContaCorrente) {
                    System.out.println(c);
                    controle++;
                }
            }
            if (controle == 0) {
                System.out.println("Nao há contas corrente cadastradas!");
            }
        } else {
            System.out.println("Ainda nao existem contas cadastradas!");
        }
    }

}
