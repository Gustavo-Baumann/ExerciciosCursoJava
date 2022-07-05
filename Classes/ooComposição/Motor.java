package ooComposição;

public class Motor {

	double fatorInjeção = 1;
	boolean ligado = false;
	final Carro carro;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	double giros(){
		if(!ligado) {
			return 0;
		}else {
		return fatorInjeção * 3000;
		}
	}
}
	
