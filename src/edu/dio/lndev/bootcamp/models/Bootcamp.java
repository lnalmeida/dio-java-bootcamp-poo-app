package edu.dio.lndev.bootcamp.models;

import edu.dio.lndev.bootcamp.abstractions.Atividade;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
     private String nome;
     private String descricao;
     private final LocalDate dataInicial = LocalDate.now();
     private final LocalDate dataFinal = dataInicial.plusDays(45);
     private Set<Dev> devsInscritos = new HashSet<>();
     private Set<Atividade> atividades = new LinkedHashSet<>();

     public Bootcamp() {
     }

     public Bootcamp(String nome, String descricao) {
          this.nome = nome;
          this.descricao = descricao;
     }

     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public String getDescricao() {
          return descricao;
     }

     public void setDescricao(String descricao) {
          this.descricao = descricao;
     }

     public LocalDate getDataInicial() {
          return dataInicial;
     }

     public LocalDate getDataFinal() {
          return dataFinal;
     }

     public Set<Dev> getDevsInscritos() {
          return devsInscritos;
     }

     public void setDevsInscritos(Set<Dev> devsInscritos) {
          this.devsInscritos = devsInscritos;
     }

     public Set<Atividade> getAtividades() {
          return atividades;
     }

     public void setAtividades(Set<Atividade> atividades) {
          this.atividades = atividades;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Bootcamp bootcamp = (Bootcamp) o;
          return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(atividades, bootcamp.atividades);
     }

     @Override
     public int hashCode() {
          return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, atividades);
     }
}
