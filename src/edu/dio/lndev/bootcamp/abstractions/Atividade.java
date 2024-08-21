package edu.dio.lndev.bootcamp.abstractions;

public abstract class Atividade {

    protected static final double XP_PADRAO = 10;
    private String titulo;
    private String descricao;

    public Atividade() {
    }

    public Atividade(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
