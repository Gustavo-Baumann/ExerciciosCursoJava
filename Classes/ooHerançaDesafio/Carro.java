package ooHerançaDesafio;

public class Carro {

	int velocidade;
	final int VELOCIDADE_MÁXIMA;
	private int delta;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MÁXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidade + getDelta() > VELOCIDADE_MÁXIMA) {
			velocidade = VELOCIDADE_MÁXIMA;
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
		System.out.println("A velocidade atual é " + velocidade + "Km/h");
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
	
}
