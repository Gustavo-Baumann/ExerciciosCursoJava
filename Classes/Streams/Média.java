package Streams;

public class M�dia {

	private double total;
	private int quantidade;
	
	public M�dia add(double valor) {
		total += valor;
		quantidade++;
		return this;
	}
	
	public double getMedia() {
		return total / quantidade;
	}
	
	public static M�dia mediaGeral(M�dia m1, M�dia m2) {
		M�dia novaMedia = new M�dia();
		novaMedia.quantidade = m1.quantidade + m2.quantidade;
		novaMedia.total = m1.total + m2.total;
		return novaMedia;
	}
}
