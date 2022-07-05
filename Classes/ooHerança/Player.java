package ooHerança;

public class Player {

	int x;
	int y;
	int hp = 10;
	
	void moved(Direção arrow){
		if(arrow == Direção.NORTE) {
			if(y < 10) {
				y++;
			}else {
				System.out.println("Movimento Indisponível");
			}
		}else if(arrow == Direção.SUL) {
			if(y > 0) {
				y--;
			}else {
				System.out.println("Movimento Indisponível");
			}
		}else if(arrow == Direção.LESTE) {
			if(x < 10) {
				x++;
			}else {
				System.out.println("Movimento Indisponível");
			}
		}else if(arrow == Direção.OESTE) {
			if(x > 0) {
				x--;
			}else {
				System.out.println("Movimento Indisponível");
			}
		}
	}
	
	public void movimento(Player player, Direção direção) {
		player.moved(direção);
		System.out.println(player.x + " " + player.y);
	}
	
	String attack(Player cpu){
		int difX = Math.abs(x - cpu.x);
		int difY = Math.abs(y - cpu.y);
		
		if(difX == 0 && difY == 1) {
			cpu.hp -= 1;
			return "Ataque bem sucedido";
		}else if(difX == 1 && difY == 0) {
			cpu.hp -= 1;
			return "Ataque bem sucedido";
		}else {
			return "Você não está em alcance de ataque";
		}
	}
	
	public void ataque (Player player, Player cpu) {
		System.out.println(player.attack(cpu));
		System.out.println("A vida do cpu é " + cpu.hp);
		if(cpu.hp <= 0) {
			System.out.println("CPU Morreu");
		}
	}
	
	protected Player(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	protected Player(){
		
	}
}
