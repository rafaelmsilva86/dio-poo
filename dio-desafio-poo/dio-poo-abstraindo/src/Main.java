import br.com.dio.desafio.poo.dominio.Curso;
import br.com.dio.desafio.poo.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("curso de java");
        curso.setCargaHoraria(8);
        System.out.println( curso );

        Curso curso1 = new Curso();
        curso1.setTitulo("Kotlin");
        curso1.setDescricao("Curso de kotlin");
        curso1.setCargaHoraria(6);
        System.out.println( curso1 );

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Javascript");
        mentoria.setDescricao("curso de javascript");
        mentoria.setData(LocalDate.now());
        System.out.println( mentoria );
    }
}