package ooComposição;

public class Item {

	String nome;
	int quantidade;
	double preco;
	Compra compra;  // bidirecional 
	
	Item(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	

	public String toString() {
		return this.nome;
	}
}
