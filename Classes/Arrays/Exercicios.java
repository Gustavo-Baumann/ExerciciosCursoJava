package Arrays;

import java.util.Arrays;

public class Exercicios {
	
	public static void main(String[] args) {
		
		double[] notasClasse = new double [4];
		
		notasClasse[0] = 7.6;
		notasClasse[1] = 7.9;
		notasClasse[2] = 9.6;
		notasClasse[3] = 8.5;
		
		Arrays.toString(notasClasse);
		System.out.println(Arrays.toString(notasClasse));
		
		double total = 0;
		for(int i = 0; i < notasClasse.length; i++) {
			total += notasClasse[i];
		}
		
		System.out.println(total / notasClasse.length);
		
		double notaDele = 7.5;
		
		double[] notasClasse2 = {9.9,8.5,10,notaDele};
		double total2 = 0;
		for(double nota : notasClasse2) {
			total2 += nota;
		}
		
		System.out.println(total2 / notasClasse2.length);
		
	}
	
}
