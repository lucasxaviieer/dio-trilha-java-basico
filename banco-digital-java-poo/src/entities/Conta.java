package entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Conta {

    private static final Integer AGENCIA_PADRAO = 1;
    private static Integer SEQUENCIAL = 1;

    protected Integer agencia;
    protected Integer numero;
    protected Double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0d;
        this.cliente = cliente;
    }

    public void sacar(Double valor) {
        if (!(saldo - valor < 0)) {
            saldo -= valor;
        } else {
            throw new RuntimeException("Saldo insuficiente");
        }
    }

    public void transferir(Double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void depositar(Double valor) {
        saldo += valor;
    }

    protected void imprirmirInfosComuns() {
        System.out.println(
                "Conta [" + " Titular=" + this.cliente.getNome() + ", Agencia=" + this.agencia + ", Numero="
                        + this.numero
                        + ", Saldo="
                        + String.format("%.2f", this.saldo) + "]");
    }

    public abstract void imprimirExtrato();

}
