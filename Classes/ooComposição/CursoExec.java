package ooComposição;

public class CursoExec {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("André");
		Aluno aluno2 = new Aluno("Bianca");
		Aluno aluno3 = new Aluno("Caio");
		
		Curso curso1 = new Curso("Maths");
		Curso curso2 = new Curso("Fisics");
		Curso curso3 = new Curso("Quimics");
		
		curso1.addAluno(aluno1);
		curso1.addAluno(aluno2);
		curso2.addAluno(aluno2);
		curso2.addAluno(aluno3);
		
		aluno1.addCurso(curso3);
		aluno3.addCurso(curso3);
		
		for(Aluno aluno : curso1.alunos) {
			System.out.println("eu sou " + aluno.nome + "\ne estou fazendo Maths");
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		System.out.println();
		
	    Curso match = aluno1.obterCurso("Maths");
	    if(match != null) {
	    	System.out.println(match.nome);
	    	System.out.println(match.alunos);
	    }
	}
	
}
