import br.com.dio.desafio.poo.dominio.Bootcamp;
import br.com.dio.desafio.poo.dominio.Curso;
import br.com.dio.desafio.poo.dominio.Dev;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        System.out.println("Conteudos inscritos Rafael " + devRafael.getConteudosInseridos());
        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Rafael " + devRafael.getConteudosInseridos());
        System.out.println("Conteudos concluidos Rafael " + devRafael.getConteudosConcluidos());
        System.out.println("XP: " + devRafael.calcularTotalXp());
        System.out.println("XP: " + devRafael.calcularTotalXp());

        System.out.println("-----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao" + devJoao.getConteudosInseridos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Joao" + devJoao.getConteudosInseridos());
        System.out.println("Conteudos concluidos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}