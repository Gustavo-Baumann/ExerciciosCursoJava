package jdbc;

public class Pessoa {

	private int codigo;
	private String nome;
	private int idade;	
	
	public Pessoa(int codigo, String nome, int idade) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
	}
	
	int getCodigo() {
		return codigo;
	}
	
	void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	String getNome() {
		return nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	int getIdade() {
		return idade;
	}
	
	void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
