package ClasseObjeto;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;  // valor unico que pertence a classe 
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		// novo construtor desativa o default sem parametros
	}
	
	Produto(){
		// reativa o construtor default
	}
	
	double calculoDesconto() {
		return preco * (1 - desconto);
	}
	
	double calculoDesconto(double cupom) {
		return preco * (1 -(desconto + cupom));
	}
	
	
}
