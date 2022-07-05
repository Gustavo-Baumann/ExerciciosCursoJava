package fundamentos;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		System.out.println(43 < 44); // menor que
		System.out.println(32 <= 43); // menor ou igual
		System.out.println(31 > 32); // maior que
		System.out.println(34 >= 43); // maior ou igual
		System.out.println(12 != 43); // diferente
		
		System.out.println("---------");
		
		double nota = 7.7;
		boolean ok = true;
		boolean passou = nota >=7;
		boolean aprovado = ok && passou;
		System.out.println(aprovado);
	}
}
