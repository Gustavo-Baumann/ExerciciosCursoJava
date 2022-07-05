package Erros;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			mostrarNome(a1);
		} catch (Exception e) {
			System.out.println("Aluno Inválido");
		}
		
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
		System.out.println("Fin");
		
	}

	public static void mostrarNome(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
