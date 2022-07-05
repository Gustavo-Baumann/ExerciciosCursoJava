package ClasseObjeto;

public class InfoTeste {

	public static void main(String[] args) {
		
		Info objeto = new Info(1200,0.2);
		objeto.nome = "Celular";
		double precoFinal = objeto.precoFinal();
		System.out.println(objeto.nome + " custa R$" + precoFinal);
		
		Info objeto2 = new Info(6000,0.1);
		objeto2.nome = "Computador";
		double precoFinal2 = objeto2.precoFinal();
		System.out.println(objeto2.nome + " custa R$" + precoFinal2);
		
		Info objeto3 = new Info(150,0.3);
		objeto3.nome = "Cafeteira";
		double precoFinal3 = objeto3.precoFinal();
		System.out.println(objeto3.nome + " custa R$" + precoFinal3);
		
	}
}
