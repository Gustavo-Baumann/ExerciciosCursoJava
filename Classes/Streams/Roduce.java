package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Roduce {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Zé", 7.0);
		Aluno a2 = new Aluno("Zé", 7.1);
		Aluno a3 = new Aluno("Zé", 7.2);
		Aluno a4 = new Aluno("Zé", 7.3);
		Aluno a5 = new Aluno("Zé", 7.4);
		
		List<Aluno> classe = Arrays.asList(a1,a2,a3,a4,a5);
		
		BiFunction<Média,Double,Média> calculoFinal = (media, nota) -> media.add(nota);
		BinaryOperator<Média> combinar = (m1,m2) -> Média.mediaGeral(m1, m2);
		
		Média media = classe.stream()
		.filter(Misc.aprovado)
		.map(Misc.getNota)
		.reduce(new Média(), calculoFinal, combinar);
		
		System.out.println("A média é: " + media.getMedia());
		
		
	}

}
