package ClasseObjeto;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){  // construtor 
		// dia = 01;
		// mes = 01;
		// ano = 1970;		
	    this(1, 1, 1970);  
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;  // em caso das vari�veis forem iguais as da classe,
		this.mes = mes;  // usa this para referenciar a vari�vel de instancia (the top one)
		this.ano = ano;  // caso contrario vc s� atribui dia para si proprio dentro de data
	}
	
    String obterData() {
		return String.format("Primeira data � %d/%d/%d",dia, mes, ano);
	}
}
