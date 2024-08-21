package edu.dio.lndev.bootcamp.models;

import edu.dio.lndev.bootcamp.abstractions.Atividade;

public class Curso extends Atividade {

    private int cargaHorariaCurso;

    public Curso() {
    }

    public Curso(String titulo, String descricao, int cargaHorariaCurso) {
        this.cargaHorariaCurso = cargaHorariaCurso;
        super.setTitulo(titulo);
        super.setDescricao(descricao);
    }

    public int getCargaHorariaCurso() {
        return cargaHorariaCurso;
    }

    public void setCargaHorariaCurso(int cargaHorariaCurso) {
        this.cargaHorariaCurso = cargaHorariaCurso;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "\nCurso: " +
                "\ntitulo = '" + super.getTitulo() + '\'' +
                ", \ndescrição = '" + super.getDescricao() + '\'' +
                ", \ncarga horária = " + cargaHorariaCurso +
                '}';
    }
}
