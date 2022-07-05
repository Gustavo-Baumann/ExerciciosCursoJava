package ClasseObjeto;

public class ValorIReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a;   // atribuição por valor
		
		a++;
		b--;
		System.out.println(a + " " + b);
	
		Data d1 = new Data(1,6,2022);
		Data d2 = d1;   // atribuição por referencia
		
		d1.dia = 8;
		d2.mes = 4;
		
		System.out.println(d1.obterData());  // mesmos resultados pois ambas 
		System.out.println(d2.obterData());  // variaveis usam a mesma referencia
		
		resetarData(d1);    // vc pode usar atribuição e modificar objetos
		
		System.out.println(d1.obterData());  // mesmos resultados pois ambas 
		System.out.println(d2.obterData());  // variaveis usam a mesma referencia
		
		int c = 5;              // neste caso c não foi afetado pelo a++ abaixo
		alterarPrimal(c);       // pq é uma atribuição por valor
		System.out.println(c);  // apenas uma copia de c foi usada pelo metodo
		
		Integer y = 7;
		alterarPrimal2(y);      // este tbm n é afetado n sei pq :)
		System.out.println(y);
		
	
	}
	
	static void resetarData(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimal(int c) {
		c++;
	}
	
	static void alterarPrimal2 (Integer x) {
		x++;
	}
}
