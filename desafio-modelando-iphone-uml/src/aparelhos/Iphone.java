package aparelhos;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando do iphone para o numero: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo do iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo iphone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina web pelo iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador pelo iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina do navegador do iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica pelo iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica no iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica + " no iphone");
    }

}
