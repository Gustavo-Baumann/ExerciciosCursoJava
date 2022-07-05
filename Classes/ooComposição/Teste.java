package ooComposição;

public class Teste {

	public static void main(String[] args) {
		
		Carro corcel = new Carro();
		System.out.println(corcel.estaLigado());
		corcel.ligar();
		System.out.println(corcel.estaLigado());
		System.out.println(corcel.motor.giros());
		corcel.acelerar();
		corcel.acelerar();
		corcel.acelerar();
		System.out.println(corcel.motor.giros());
		corcel.freiar();
		corcel.freiar();
		System.out.println(corcel.motor.giros());
		corcel.freiar();
		corcel.freiar();
		corcel.freiar();
		System.out.println(corcel.motor.giros());
		
		System.out.println();
		
		corcel.motor.fatorInjeção = -50;     // neste caso faltou limitar (encapsulamento)
        System.out.println(corcel.motor.giros());   // garbage
		
        corcel.motor.carro.motor.carro.motor.carro.motor.giros(); // prova relação 1:1 
		// um carro tem um motor, e um motor tem um carro
			
		
	}
}
