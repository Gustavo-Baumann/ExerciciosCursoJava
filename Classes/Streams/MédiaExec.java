package Streams;

public class M�diaExec {

	public static void main(String[] args) {
		
		M�dia m1 = new M�dia();
		m1.add(6.8);  // add � s� o nome do metodo
		m1.add(8.5);  // n�o � o .add de listas n' shit
		m1.add(10);   // add pega o valor do parametro e add ao valor total 
		m1.add(5.9);
		m1.add(7.9);
		
		System.out.println(m1.getMedia());
		
		M�dia m2 = new M�dia().add(7.7).add(9.0).add(5.7);
		
		System.out.println(m2.getMedia());
		
		System.out.println(M�dia.mediaGeral(m1, m2).getMedia());
	}

}
