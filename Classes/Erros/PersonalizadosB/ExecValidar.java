package Erros.PersonalizadosB;

import Erros.Aluno;

public class ExecValidar {

	public static void main(String[] args) {
		
		try {
			Aluno a1 = new Aluno("Zé" , -7.0);
			Validar.aluno(a1);
			Validar.aluno(null);
		} catch (StringVaziaException e) {	
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("fim");
		
	}
}
