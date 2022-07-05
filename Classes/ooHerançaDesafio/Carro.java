package ooHeran�aDesafio;

public class Carro {

	int velocidade;
	final int VELOCIDADE_M�XIMA;
	private int delta;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_M�XIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidade + getDelta() > VELOCIDADE_M�XIMA) {
			velocidade = VELOCIDADE_M�XIMA;
		}else {
			velocidade += getDelta();
		}
	}
	
	public void freiar() {
		if(velocidade >= 5) {
			velocidade -= 5;
		}else {
			velocidade = 0;
		}
	}
	
	public void velocimetro() {
		System.out.println("A velocidade atual � " + velocidade + "Km/h");
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
	
}
