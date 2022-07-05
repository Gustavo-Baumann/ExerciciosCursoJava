package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Zé", 6.9);
		Aluno a2 = new Aluno("Zé", 7.1);
		Aluno a3 = new Aluno("Zé", 7.2);
		Aluno a4 = new Aluno("Zé", 7.3);
		Aluno a5 = new Aluno("Zé", 7.4);
		
		List<Aluno> classe = Arrays.asList(a1,a2,a3,a4,a5);
		
		Comparator<Aluno> melhorNota = (al1, al2) -> {
			if(al1.nota > al2.nota) return 1;  
			if(al1.nota < al2.nota) return -1;
			return 0;
		};
		
		Comparator<Aluno> piorNota = (al1, al2) -> {
			if(al1.nota > al2.nota) return -1;
			if(al1.nota < al2.nota) return 1;
			return 0;
		};
		
		System.out.println(classe.stream().max(melhorNota).get()); // maior valor
		System.out.println(classe.stream().min(melhorNota).get()); // menor valor
		System.out.println(classe.stream().max(piorNota).get());   
		
	}

}
