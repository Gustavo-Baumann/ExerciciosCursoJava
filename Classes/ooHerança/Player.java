package ooHeran�a;

public class Player {

	int x;
	int y;
	int hp = 10;
	
	void moved(Dire��o arrow){
		if(arrow == Dire��o.NORTE) {
			if(y < 10) {
				y++;
			}else {
				System.out.println("Movimento Indispon�vel");
			}
		}else if(arrow == Dire��o.SUL) {
			if(y > 0) {
				y--;
			}else {
				System.out.println("Movimento Indispon�vel");
			}
		}else if(arrow == Dire��o.LESTE) {
			if(x < 10) {
				x++;
			}else {
				System.out.println("Movimento Indispon�vel");
			}
		}else if(arrow == Dire��o.OESTE) {
			if(x > 0) {
				x--;
			}else {
				System.out.println("Movimento Indispon�vel");
			}
		}
	}
	
	public void movimento(Player player, Dire��o dire��o) {
		player.moved(dire��o);
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
			return "Voc� n�o est� em alcance de ataque";
		}
	}
	
	public void ataque (Player player, Player cpu) {
		System.out.println(player.attack(cpu));
		System.out.println("A vida do cpu � " + cpu.hp);
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
