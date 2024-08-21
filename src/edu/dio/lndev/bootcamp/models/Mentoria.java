package edu.dio.lndev.bootcamp.models;

import edu.dio.lndev.bootcamp.abstractions.Atividade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Mentoria extends Atividade {

    private LocalDate dataMentoria;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.dataMentoria = dataMentoria;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }



    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "\nMentoria {" +
                "titulo = '" + super.getTitulo() + '\'' +
                ", \ndescrição = '" + super.getDescricao() + '\'' +
                ", \ndata = " + dataMentoria.format(formatter) +
                '}';
    }
}
