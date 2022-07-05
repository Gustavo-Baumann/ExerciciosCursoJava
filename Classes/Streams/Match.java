package Streams;

import java.util.Arrays;
import java.util.List;

public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Zé", 6.9);
		Aluno a2 = new Aluno("Zé", 7.1);
		Aluno a3 = new Aluno("Zé", 7.2);
		Aluno a4 = new Aluno("Zé", 7.3);
		Aluno a5 = new Aluno("Zé", 7.4);
		
		List<Aluno> classe = Arrays.asList(a1,a2,a3,a4,a5);
		
		System.out.println(classe.stream().allMatch(Misc.aprovado));  // true se todos itens baterem
		System.out.println(classe.stream().anyMatch(Misc.aprovado));  // true se um item bater
		System.out.println(classe.stream().anyMatch(Misc.aprovado.negate())); // true se um item n bater
		System.out.println(classe.stream().noneMatch(Misc.aprovado)); // true se nem um item bater
		System.out.println(classe.stream().anyMatch(Misc.reprovado)); // mesma coisa da 3 linha
	}
}
