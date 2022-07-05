package lambdas;

public class Produto {

	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public double getPreco() {
		return preco;
	}	
	
	@Override
	public String toString() {
		return nome + " custa " + preco;
	}

	
}
