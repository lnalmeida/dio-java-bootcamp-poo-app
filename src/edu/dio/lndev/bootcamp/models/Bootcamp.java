package edu.dio.lndev.bootcamp.models;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Bootcamp {
     LocalDate dataInicial;
     LocalDate dataFinal;
     String nome;
     String descricao;
     List<Dev> devs;
     List<Mentoria> mentorias;
     List<Curso> cursos;
}
