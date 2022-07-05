package Streams;

import java.util.Arrays;
import java.util.List;

public class Riduce {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Zé", 7.0);
		Aluno a2 = new Aluno("Zé", 7.1);
		Aluno a3 = new Aluno("Zé", 7.2);
		Aluno a4 = new Aluno("Zé", 7.3);
		Aluno a5 = new Aluno("Zé", 7.4);
		
		List<Aluno> lista = Arrays.asList(a1,a2,a3,a4,a5);
		
		//Predicate<Aluno> aprovado = a -> a.nota >= 7;
		//Function<Aluno, Double> getNota = a -> a.nota;
		
		lista.stream()
		.filter(Misc.aprovado) 
		.map(Misc.getNota)
		.reduce(Misc.somaDouble)
		.ifPresent(System.out::println);;
	
		
	
	}
	
}
