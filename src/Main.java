import edu.dio.lndev.bootcamp.models.Curso;
import edu.dio.lndev.bootcamp.models.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Java básico", "Curso de java básico da DIO", 15);
        Curso cursoJS = new Curso("Javascript básico", "Curso de javascripti da DIO", 20);

        System.out.println(cursoJava.toString());
        System.out.println(cursoJS.toString());

        Mentoria mentoria1 = new Mentoria("Como entrar no mercado java", "mentoria com josé da silva, criador do site seja programador senior em 3 semanas",  LocalDate.of(2024, 9, 25));
        Mentoria mentoria2 = new Mentoria("Como ficar rico sendo programador", "mentoria com helio musqui, criador de conteúdo sobre html para iniciantes",  LocalDate.of(2024, 9, 26));

        System.out.println(mentoria1.toString());
        System.out.println(mentoria2.toString());

    }
}