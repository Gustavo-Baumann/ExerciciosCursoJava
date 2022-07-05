package Arrays;

public class Exercicios2 {

	public static void main(String[] args) {
		
		double[] lista = {5.7,6.9,9.3,8.8};
		double total = 0;
		
		for(double notas : lista) {
			total += notas;
		}
		
		System.out.println(total / lista.length);
	}
}
