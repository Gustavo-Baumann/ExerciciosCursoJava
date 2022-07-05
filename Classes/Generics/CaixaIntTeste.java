package Generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		
		CaixaInt caixa1 = new CaixaInt();
		caixa1.guardar("outra caixa");
		System.out.println(caixa1.abrir());
		
	}

}
