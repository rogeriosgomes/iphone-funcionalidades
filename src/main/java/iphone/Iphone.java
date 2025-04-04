package iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");
    }

    @Override
    public void finalizar() {
        System.out.println("Ligação encerrada");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void comprarMusica(String musica) {
        System.out.println("Música : " + musica + " comprado com sucesso.");
    }

    @Override
    public void pesquisarMusica(String musica) {
        System.out.println("Pesquisando musica");
    }

    @Override
    public void pesqisarArtista(String artista) {
        System.out.println("Pesquisando artista");
    }
}
