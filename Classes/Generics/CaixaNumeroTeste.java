package Generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Integer> caixa1 = new CaixaNumero<>();
		caixa1.guardar(56);
		System.out.println(caixa1.abrir());
		
		//CaixaNumero<String> caixa2 = new CaixaNumero<>();  String n extends Number
	}
	

}
