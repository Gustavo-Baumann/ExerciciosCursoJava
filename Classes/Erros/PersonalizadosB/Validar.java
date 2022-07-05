package Erros.PersonalizadosB;

import Erros.Aluno;

public class Validar {

	private Validar() {} 
	
	public static void aluno(Aluno aluno)  
		throws StringVaziaException, NumeroForaIntervaloException {
		
		if(aluno == null) {
			throw new IllegalArgumentException("Aluno não existente");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
		System.out.println("Aluno validado");
	}

}
