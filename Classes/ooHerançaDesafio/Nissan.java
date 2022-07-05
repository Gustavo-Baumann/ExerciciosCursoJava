package ooHerançaDesafio;

public class Nissan extends Carro implements SportsCar, Convo{

	private boolean ligarNitro;
	private boolean ligarConversivel;
	
	public void freiar() {
		if(velocidade >= 10) {
			velocidade -= 10;
		}else {
			velocidade = 0;
		}
	}
	
	public Nissan(){
		super(200);
		setDelta(5);
	}
	
	Nissan(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(5);
	}
	
	public void nitro() {
		ligarNitro = true;
	}
	public void nitroShutDown() {
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
			return 15;
		}else if(ligarNitro && ligarConversivel) {
			return 10;
		}else if(!ligarNitro && !ligarConversivel) {
			return 5;
		}else {
			return 3;
		}
	}
}
