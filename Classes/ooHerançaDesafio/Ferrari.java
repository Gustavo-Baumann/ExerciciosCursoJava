package ooHerançaDesafio;

public class Ferrari extends Carro implements SportsCar, Convo{
	
	private boolean ligarNitro;
	private boolean ligarConversivel;
	
	public Ferrari(){
		super(220);
		setDelta(15);
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	public void nitro() {
		setDelta(20);
		ligarNitro = true;
	}
	public void nitroShutDown() {
		setDelta(20);
		ligarNitro = false;
	}
	
	public void conversivelOn() {
		ligarConversivel = true;
	}
	public void conversivelOff() {
		ligarConversivel = false;
	}
	
	public int getDelta() {
		if(ligarNitro && !ligarConversivel) {
			return 20;
		}else if(ligarNitro && ligarConversivel) {
			return 17;
		}else if(!ligarNitro && !ligarConversivel) {
			return 15;
		}else {
			return 12;
		}
	}
}
