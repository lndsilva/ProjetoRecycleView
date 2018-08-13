package br.senac.sp.l13.projetorecycleview;

public class ListaItem {

    private String titulo;
    private String descricao;

    public ListaItem(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

}
