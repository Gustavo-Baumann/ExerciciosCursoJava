package ClasseObjeto;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		//data1.dia = 12;
		//data1.mes = 5;
		//data1.ano = 2017;
		
		Data data2 = new Data(14,9,2020);
		//data2.dia = 24;
		//data2.mes = 9;
		//data2.ano = 2020;
		
		System.out.println(data1.obterData());  // otimizado 
		System.out.printf("Segunda data é %d/%d/%d",data2.dia, data2.mes, data2.ano);
	
	
				
	}
}
