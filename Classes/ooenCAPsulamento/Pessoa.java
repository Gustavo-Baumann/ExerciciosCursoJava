package ooenCAPsulamento;

public class Pessoa {

	private int idade;
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public Pessoa(int idade, String nome) {
		setNome(nome);
		setIdade(idade);
	}
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	
	public String toString() {
		return "Meu nome é " + getNome() + " e tenho " + getIdade() + " anos";
	}

}
