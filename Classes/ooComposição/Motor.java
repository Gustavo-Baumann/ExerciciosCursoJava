package ooComposi��o;

public class Motor {

	double fatorInje��o = 1;
	boolean ligado = false;
	final Carro carro;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	double giros(){
		if(!ligado) {
			return 0;
		}else {
		return fatorInje��o * 3000;
		}
	}
}
	
