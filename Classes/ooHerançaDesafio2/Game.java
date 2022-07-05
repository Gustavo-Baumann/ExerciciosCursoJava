package ooHerançaDesafio2;

import ooHerança.Boss;
import ooHerança.Direção;
import ooHerança.Knight;

public class Game {

	public static void main(String[] args) {
		
		Knight player1 = new Knight();
		Boss cpu = new Boss(5,5);
		
		
		
		player1.movimento(player1, Direção.NORTE);
		player1.movimento(player1, Direção.LESTE);
		player1.movimento(player1, Direção.LESTE);
		player1.movimento(player1, Direção.NORTE);
		player1.movimento(player1, Direção.LESTE);
		player1.movimento(player1, Direção.LESTE);
		player1.movimento(player1, Direção.LESTE);
		player1.movimento(player1, Direção.NORTE);
		player1.movimento(player1, Direção.NORTE);
		player1.ataque(player1, cpu);
		player1.ataque(player1, cpu);
		player1.ataque(player1, cpu);
		cpu.movimento(cpu, Direção.LESTE);
		player1.ataque(player1, cpu);
		player1.movimento(player1, Direção.LESTE);
		player1.ataque(player1, cpu);
		player1.ataque(player1, cpu);
		
	}
}
