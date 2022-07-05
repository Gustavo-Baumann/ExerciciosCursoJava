package Streams;

public class MédiaExec {

	public static void main(String[] args) {
		
		Média m1 = new Média();
		m1.add(6.8);  // add é só o nome do metodo
		m1.add(8.5);  // não é o .add de listas n' shit
		m1.add(10);   // add pega o valor do parametro e add ao valor total 
		m1.add(5.9);
		m1.add(7.9);
		
		System.out.println(m1.getMedia());
		
		Média m2 = new Média().add(7.7).add(9.0).add(5.7);
		
		System.out.println(m2.getMedia());
		
		System.out.println(Média.mediaGeral(m1, m2).getMedia());
	}

}
