package control;

import model.Aluno;

public class Principal {
	
	public static void main(String[] args) {
		
		Aluno aluno01 = new Aluno();
		
		aluno01.setNome("Alexandre Tannus");
		aluno01.setMatricula(845127L);
		
		System.out.println(aluno01.getNome());
		System.out.println(aluno01.getMatricula());
		
		System.out.println(aluno01.toString());
		
	}
	
}
