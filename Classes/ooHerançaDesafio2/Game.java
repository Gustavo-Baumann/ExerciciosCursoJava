package ooHeran�aDesafio2;

import ooHeran�a.Boss;
import ooHeran�a.Dire��o;
import ooHeran�a.Knight;

public class Game {

	public static void main(String[] args) {
		
		Knight player1 = new Knight();
		Boss cpu = new Boss(5,5);
		
		
		
		player1.movimento(player1, Dire��o.NORTE);
		player1.movimento(player1, Dire��o.LESTE);
		player1.movimento(player1, Dire��o.LESTE);
		player1.movimento(player1, Dire��o.NORTE);
		player1.movimento(player1, Dire��o.LESTE);
		player1.movimento(player1, Dire��o.LESTE);
		player1.movimento(player1, Dire��o.LESTE);
		player1.movimento(player1, Dire��o.NORTE);
		player1.movimento(player1, Dire��o.NORTE);
		player1.ataque(player1, cpu);
		player1.ataque(player1, cpu);
		player1.ataque(player1, cpu);
		cpu.movimento(cpu, Dire��o.LESTE);
		player1.ataque(player1, cpu);
		player1.movimento(player1, Dire��o.LESTE);
		player1.ataque(player1, cpu);
		player1.ataque(player1, cpu);
		
	}
}
