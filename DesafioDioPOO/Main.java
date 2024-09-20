package DesafioDioPOO;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Cursos curso1 = new Cursos("java", "descrição de curso java", 8);
		Cursos curso2 = new Cursos("javaScript", "descrição de curso javaScript", 8);
		Mentorias mentoria1 = new Mentorias("mentoria java", "descricao mentoria", LocalDate.now());

		System.out.println(curso1);
		System.out.println(mentoria1);

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java");
		bootcamp.setDescricao("descrição bootcamp java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);

		Dev dev1 = new Dev();
		dev1.setNome("Bruno");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("conteudos inscritos: "+ dev1.getConteudoInscridos());
		dev1.progredir();
		System.out.println("conteudos inscritos: "+ dev1.getConteudoInscridos());
		System.out.println("conteudos concluidos: "+ dev1.getConteudoConcluido());
		System.out.println("xp: " + dev1.calcularTotalXP());
		
		
		
		Dev dev2 = new Dev();
		dev2.setNome("camila");

	}

}
