package ooPolimorfismo;

public abstract class Comida {

	private double peso;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public Comida(double peso) {
		setPeso(peso);
	}
	

}
