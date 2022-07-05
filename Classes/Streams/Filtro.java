package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filtro {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Alice", 8.6);
		Aluno a2 = new Aluno("Bruno", 9.3);
		Aluno a3 = new Aluno("Carla", 6.4);
		Aluno a4 = new Aluno("Dante", 7.4);
		Aluno a5 = new Aluno("Elias", 9.2);
		Aluno a6 = new Aluno("Fábio", 6.8);
		
		List<Aluno> classe = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7; 
		Predicate<Aluno> reprovado = aluno -> aluno.nota < 7;
		
		classe.stream()
		.filter(aprovado) // se for usar mais de 1x melhor fazer uma lambda 
		.map(aluno -> "Parabéns " + aluno.nome + ", Você passou!")
		.forEach(System.out::println);;
		
		classe.stream()
		.filter(reprovado)  // mas se for usar 1x só melhor escrever direto igual abaixo
		.map(aluno -> aluno.nome + ", Você está de recuperação")
		.forEach(System.out::println);
		
	}

}
