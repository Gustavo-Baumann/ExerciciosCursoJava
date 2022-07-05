package ooComposição;

public class Carro {

	final Motor motor;

	Carro(){
		this.motor = new Motor(this);
	}
	

	void acelerar() {
		if(motor.fatorInjeção < 2)
		motor.fatorInjeção += 0.3;
	}
	void freiar() {
		if(motor.fatorInjeção > 0.5) {
		motor.fatorInjeção -= 0.3;
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
