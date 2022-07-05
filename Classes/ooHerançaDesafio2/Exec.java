package ooHerançaDesafio2;

import ooHerançaDesafio.Ferrari;
import ooHerançaDesafio.Nissan;

public class Exec {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
		Nissan nissan = new Nissan();
		
		ferrari.conversivelOn();
		nissan.nitro();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		nissan.acelerar();
		nissan.acelerar();
		nissan.acelerar();
		
		ferrari.velocimetro();
		nissan.velocimetro();
		
		ferrari.nitroShutDown();
		nissan.nitroShutDown();
		ferrari.freiar();
		ferrari.freiar();
		ferrari.freiar();
		nissan.freiar();
		nissan.freiar();
		
		ferrari.velocimetro();
		nissan.velocimetro();
	}
}
