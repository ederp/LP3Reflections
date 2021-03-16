package ex1;

import profmateria.Materia;

public class Principal {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		    Materia materia = new Materia();
			materia.setIdMateria(5555555);
			materia.setNome("Linguagem de Programação I");
			materia.setCurso("Tecnologia em Analise e Desenvolvimento de Sistemas");
			materia.setPeriodo("Noturno");
			materia.setProfessor("José da Silva", 555555, "Rua Vitoria, 123");
			
			Reflexao.refletirObjeto(materia, Materia.class);
			
			/*
			System.out.println("Dados da materia: ");
			System.out.println("Código: "+materia.getIdMateria());
			System.out.println("Nome: "+materia.getNome());
			System.out.println("Curso: "+materia.getCurso());
			System.out.println("Periodo: "+materia.getPeriodo());
			System.out.println("\nDados do professor: "+materia.getProfessor());
		 * */
	}

}
