package funcionalidades;

public class ReprodutorMusical {
    public void tocar() {
        System.out.println("A música está tocando!");
    }

    public void pausar() {
        System.out.println("Música pausada...");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica " + musica + " Selecionada...");
        tocar();
    }
}
