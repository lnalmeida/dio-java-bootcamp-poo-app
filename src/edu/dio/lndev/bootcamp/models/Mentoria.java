package edu.dio.lndev.bootcamp.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Mentoria {

    private String tituloMentoria;
    private String descricaoMentoria;
    private LocalDate dataMentoria;

    public Mentoria() {
    }

    public Mentoria(String tituloMentoria, String descricaoMentoria, LocalDate dataMentoria) {
        this.tituloMentoria = tituloMentoria;
        this.descricaoMentoria = descricaoMentoria;
        this.dataMentoria = dataMentoria;
    }

    public String getTituloMentoria() {
        return tituloMentoria;
    }

    public void setTituloMentoria(String tituloMentoria) {
        this.tituloMentoria = tituloMentoria;
    }

    public String getDescricaoMentoria() {
        return descricaoMentoria;
    }

    public void setDescricaoMentoria(String descricaoMentoria) {
        this.descricaoMentoria = descricaoMentoria;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mentoria mentoria = (Mentoria) o;
        return Objects.equals(tituloMentoria, mentoria.tituloMentoria);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tituloMentoria);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "\nMentoria {" +
                "titulo = '" + tituloMentoria + '\'' +
                ", \ndescrição = '" + descricaoMentoria + '\'' +
                ", \ndata = " + dataMentoria.format(formatter) +
                '}';
    }
}
