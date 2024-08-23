import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical musica = new ReprodutorMusical();

        musica.selecionarMusica("Barões da pisadinha");
        musica.pausar();

        AparelhoTelefonico tel = new AparelhoTelefonico();
        
        tel.atender();
        tel.ligar("799696969");
        tel.iniciarCorreioVoz();

        NavegadorInternet nav = new NavegadorInternet();

        nav.adicionarNovaAba();
        nav.atualizarPagina();
        nav.exibirPagina("https...");
    }
}
