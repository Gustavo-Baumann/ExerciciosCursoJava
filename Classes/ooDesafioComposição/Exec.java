package ooDesafioComposição;

public class Exec {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("SÃO JERONIMO");
		Compra compra1 = new Compra();
		compra1.addItem("Carne", 24.0, 2);
		compra1.addItem(new Produto("Café",14.0), 2);
		
		Compra compra2 = new Compra();
		compra2.addItem("Sal", 6.5, 1);
		compra2.addItem(new Produto("Arroz",22.1), 3);
		
		cliente.addCompra(compra1);
		cliente.addCompra(compra2);
		
		System.out.println(cliente.obterTotal2());
	}

}
