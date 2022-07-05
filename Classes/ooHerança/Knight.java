package ooHerança;

public class Knight extends Player {

	String attack(Player cpu){
		int difX = Math.abs(x - cpu.x);
		int difY = Math.abs(y - cpu.y);
		
		if(difX == 0 && difY == 1) {
			cpu.hp -= 2;
			return "Ataque bem sucedido";
		}else if(difX == 1 && difY == 0) {
			cpu.hp -= 2;
			return "Ataque bem sucedido";
		}else {
			return "Você não está em alcance de ataque";
		}
	}
	
}


