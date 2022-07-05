package ooComposição;

public class CompraExec {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "Afonso";
		c1.addItem(new Item("Sorvete",3,24.90));
		c1.addItem(new Item("Chocolate",2,12.50));
		c1.addItem(new Item("Suco",5,3.75));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.itens);
		System.out.println(c1.obterCusto());
		
		//c1.itens.get(0).compra.itens.get(0)....
		
		
	}

}
