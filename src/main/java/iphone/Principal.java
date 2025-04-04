package iphone;

public class Principal {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        //Aparelho Telefônico
        System.out.println("----Aparelho Telefônico-----");
        iphone.ligar("656565");
        iphone.atender();
        iphone.finalizar();
        iphone.iniciarCorreioVoz();

        //Navegação na internet
        System.out.println("----Navegação na internet-----");
        iphone.exibirPagina("wwww.teste.com.br");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        //Reprodução de música
        System.out.println("----Reprodução de música-----");
        iphone.selecionarMusica("ainda ontem chorei de saudade");
        iphone.tocar();
        iphone.pausar();
        iphone.comprarMusica("chou da Xuxa");
        iphone.pesquisarMusica("chora amor");
        iphone.pesqisarArtista("Roberto Carlos");

    }
}
