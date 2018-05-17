package app;

import entidade.Aluno;

public class TestEnum {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setNome("Zé");
		aluno.setNota01(7.3);
		aluno.setNota02(9.0);
		
		System.out.println("informes do aluno:\n"
				+ "nome:" + aluno.getNome()
				+ "\nPrimeira nota: " + aluno.getNota01() 
				+ "\nSegunda nota: " + aluno.getNota02()
				+ "\n Sua situação é: " + aluno.situacao());
				
		
		
		}
	}

