package Streams;

public class Média {

	private double total;
	private int quantidade;
	
	public Média add(double valor) {
		total += valor;
		quantidade++;
		return this;
	}
	
	public double getMedia() {
		return total / quantidade;
	}
	
	public static Média mediaGeral(Média m1, Média m2) {
		Média novaMedia = new Média();
		novaMedia.quantidade = m1.quantidade + m2.quantidade;
		novaMedia.total = m1.total + m2.total;
		return novaMedia;
	}
}
