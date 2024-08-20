package edu.dio.lndev.bootcamp.models;

import java.util.Objects;

public class Curso {
    private String tituloCurso;
    private String descricaoCurso;
    private int cargaHorariaCurso;

    public Curso() {
    }

    public Curso(String tituloCurso, String descricaoCurso, int cargaHorariaCurso) {
        this.cargaHorariaCurso = cargaHorariaCurso;
        this.tituloCurso = tituloCurso;
        this.descricaoCurso = descricaoCurso;
    }

    public String getTituloCurso() {
        return tituloCurso;
    }

    public void setTituloCurso(String tituloCurso) {
        this.tituloCurso = tituloCurso;
    }

    public int getCargaHorariaCurso() {
        return cargaHorariaCurso;
    }

    public void setCargaHorariaCurso(int cargaHorariaCurso) {
        this.cargaHorariaCurso = cargaHorariaCurso;
    }

    public String getDescricaoCurso() {
        return descricaoCurso;
    }

    public void setDescricaoCurso(String descricaoCurso) {
        this.descricaoCurso = descricaoCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(tituloCurso, curso.tituloCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tituloCurso);
    }

    @Override
    public String toString() {
        return "\nCurso {" +
                "titulo = '" + tituloCurso + '\'' +
                ", \ndescrição = '" + descricaoCurso + '\'' +
                ", \ncarga horária = " + cargaHorariaCurso +
                '}';
    }
}
