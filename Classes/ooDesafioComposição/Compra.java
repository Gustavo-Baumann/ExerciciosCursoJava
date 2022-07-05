package ooDesafioComposição;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<>();
	
	void addItem(Produto x, int quantidade) {
		this.itens.add(new Item(x, quantidade));
	}
	
	void addItem(String nome, double preco, int quantidade){
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto,quantidade));
	}
	
	double obterTotal(){
		double total = 0;
		
		for(Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}