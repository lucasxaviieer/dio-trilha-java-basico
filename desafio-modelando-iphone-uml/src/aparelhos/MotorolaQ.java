package aparelhos;

import funcionalidades.AparelhoTelefonico;

public class MotorolaQ implements AparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando do motorola para o numero: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo do motorola");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo motorola");
    }

}
