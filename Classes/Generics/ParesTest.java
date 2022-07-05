package Generics;

public class ParesTest {

	public static void main(String[] args) {
		
		Pares<Integer,String> resultado = new Pares<>();
		resultado.add(1, "Alice");
		resultado.add(2, "Bruna");
		resultado.add(3, "Carol");
		resultado.add(4, "David");
		resultado.add(2, "Elias");
		System.out.println(resultado.getValor(1));
		System.out.println(resultado.getValor(2));
	}

}
