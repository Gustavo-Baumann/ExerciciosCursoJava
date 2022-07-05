package Generics;

public class CaixaTestGenerics {

	public static void main(String[] args) {
		
		Caixa<String> caixa1 = new Caixa<>();
		caixa1.guardar("pao");
		System.out.println(caixa1.abrir());
		
		Caixa<Double> caixa2 = new Caixa<>();
		caixa2.guardar(10.0);
		System.out.println(caixa2.abrir());
	}

}
