package usuarios;

import aparelhos.Iphone;
import aparelhos.MotorolaQ;

public class UsuarioCelular {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();

        // abrindo navegador iphone
        iphone.exibirPagina("https://www.web.dio.me/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // fazendo/recebendo ligaçoes iphone
        iphone.ligar("+55092991232266");
        iphone.iniciarCorreioVoz();
        iphone.atender();

        // reproduzindo musica no iphone
        iphone.tocar();
        iphone.selecionarMusica("Legiao Urbana - Faroeste Caboclo");
        iphone.pausar();

        // fazendo/recebendo ligaçoes MotorolaQ
        // AparelhoTelefonico motorola = new MotorolaQ();
        MotorolaQ motorola = new MotorolaQ();

        motorola.ligar("+55092984765811");
        motorola.iniciarCorreioVoz();
        motorola.atender();

    }
}
