package ClasseObjeto;

import java.util.HashSet;

import java.util.Set;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Calculadora", 12.99);
		p1.nome = "Calculadora";  // não é mais necessário receber o nome e preco
		p1.preco = 12.99;     // construtor foi modificado, entram como parametro
		
		var p2 = new Produto();
		p2.nome = "Caneta"; 
		p2.preco = 3.99;
		
		//Produto.desconto = 0.50;  
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal = p1.calculoDesconto();
		double precoFinal2 = p2.calculoDesconto();
		System.out.println(precoFinal);
		System.out.println(precoFinal2);
		
		System.out.println(Produto.desconto); // acessar variavel static de uma classe
		
		Set<Produto> lista = new HashSet<>(); // teste de conjunto
		lista.add(p1);
		lista.add(p2);
	}
}
