package ooComposição;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	void addItem(Item item) {      // bidirecional 
		itens.add(item);
		item.compra = this;
	}
	
	double obterCusto(){
		double valorTotal = 0;
		for(Item item : itens) {
			valorTotal += item.quantidade * item.preco;
		}
		return valorTotal;
	}

}
