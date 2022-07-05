package ooDesafioComposição;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	
	Cliente(String nome){
		this.nome = nome;
	}

	final List<Compra> compras = new ArrayList<>();
	
	void addCompra(Compra compra){
		this.compras.add(compra);
	}
	
	double obterTotal2(){
		double total = 0;
		
		for(Compra compra : compras) {
			total += compra.obterTotal();
		}
		
		return total;
	}
}
