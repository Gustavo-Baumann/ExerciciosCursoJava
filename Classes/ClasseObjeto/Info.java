package ClasseObjeto;

public class Info {

	String nome;
	double preco;
	double desconto;
	
	Info(double precoTipped, double descontoTipped){
		preco = precoTipped;
		desconto = descontoTipped;
	}
	
	double precoFinal() {
		return preco * (1 - desconto);
	}
}
