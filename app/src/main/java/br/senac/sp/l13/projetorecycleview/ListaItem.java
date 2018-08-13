package br.senac.sp.l13.projetorecycleview;

public class ListaItem {

    private String titulo;
    private String descricao;
    private String imagemURL;


    public ListaItem(String titulo, String descricao, String imagemURL) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.imagemURL = imagemURL;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getImagemURL() {
        return imagemURL;
    }

}
