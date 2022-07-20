package br.com.dio.desafio.dominio;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Script");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria para Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPamela = new Dev();
        devPamela.setNome("Pamela");
        devPamela.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Pamela" + devPamela.getConteudosInscritos());

        devPamela.progredir();

        System.out.println("--");
        System.out.println("Conteudos inscritos Pamela" + devPamela.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devPamela.getConteudosConcluidos());
        System.out.println("XP: " + devPamela.calcularXp());

        System.out.println("----------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João" + devJoao.getConteudosInscritos());

        devJoao.progredir();

        System.out.println("--");
        System.out.println("Conteudos inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devPamela.calcularXp());

    }
}
