package Generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		CaixaObj caixa1 = new CaixaObj();
		caixa1.guardar(2.3); // double -> Double
		
		Double coisa1 = (Double) caixa1.abrir();
		System.out.println(coisa1);
		
		CaixaObj caixa2 = new CaixaObj();
		caixa2.guardar("coisa");
		
		String coisa2 = (String) caixa2.abrir();
		System.out.println(coisa2);
	}

}
