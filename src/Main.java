
public class Main {
    public static void main(String[] args) {

        Navegadora nav = new Iphone();
        Reprodutor reprodutor = new Iphone();
        Telefone tel = new Iphone();


        tel.ligar();
        nav.atualizarPagina();
        reprodutor.selecionarMusica();


    }
}