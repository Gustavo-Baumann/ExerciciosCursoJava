package ooComposi��o;

public class Carro {

	final Motor motor;

	Carro(){
		this.motor = new Motor(this);
	}
	

	void acelerar() {
		if(motor.fatorInje��o < 2)
		motor.fatorInje��o += 0.3;
	}
	void freiar() {
		if(motor.fatorInje��o > 0.5) {
		motor.fatorInje��o -= 0.3;
		}
	}
	void ligar() {
		motor.ligado = true;
	}
	void desligar() {
		motor.ligado = false;
	}
	boolean estaLigado() {
		return motor.ligado;
	}
}
