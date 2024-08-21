import edu.dio.lndev.bootcamp.abstractions.Atividade;
import edu.dio.lndev.bootcamp.models.Bootcamp;
import edu.dio.lndev.bootcamp.models.Curso;
import edu.dio.lndev.bootcamp.models.Dev;
import edu.dio.lndev.bootcamp.models.Mentoria;

import java.io.DataInput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Atividade cursoJava = new Curso("Java básico", "Curso de java básico da DIO", 15);
        Atividade cursoJS = new Curso("Javascript básico", "Curso de javascripti da DIO", 20);
        Atividade  cursoCSharp = new Curso("C# básico", "Curso de C# da DIO", 25);
        Atividade  cursoDotNet = new Curso(".NET básico", "Curso de .NET da DIO", 30);

//        System.out.println(cursoJava.toString());
//        System.out.println(cursoJS.toString());

        Atividade mentoria1 = new Mentoria("Como entrar no mercado java", "mentoria com josé da silva, criador do site seja programador senior em 3 semanas",  LocalDate.of(2024, 9, 25));
        Atividade mentoria2 = new Mentoria("Como ficar rico sendo programador", "mentoria com helio musqui, criador de conteúdo sobre html para iniciantes",  LocalDate.of(2024, 9, 26));


//        System.out.println(mentoria1.toString());
//        System.out.println(mentoria2.toString());

        Bootcamp bootcamp1 = new Bootcamp("Java com Spring", "Bootcamp de java com spring");
        bootcamp1.getAtividades().add(cursoJS);
        bootcamp1.getAtividades().add(cursoJava);
        bootcamp1.getAtividades().add(mentoria1);
        bootcamp1.getAtividades().add(mentoria2);

        Bootcamp bootcamp2 = new Bootcamp("C# developer", "Bootcamp de C#");
        bootcamp2.getAtividades().add(cursoCSharp);
        bootcamp2.getAtividades().add(cursoDotNet);
        bootcamp2.getAtividades().add(mentoria1);
        bootcamp2.getAtividades().add(mentoria2);

        Dev dev1 = new Dev("Luiz");
        System.out.println("Cursos do Luiz: ");
        dev1.exibirCursos();
        Dev dev2 = new Dev("José");
        System.out.println("Cursos do josé: ");
        dev2.exibirCursos();

        dev1.inscreverBootcamp(bootcamp1);
        dev2.inscreverBootcamp(bootcamp2);

        System.out.println("Cursos do Luiz: ");
        dev1.exibirCursos();
        System.out.println("Cursos do josé: ");
        dev2.exibirCursos();

    }
}