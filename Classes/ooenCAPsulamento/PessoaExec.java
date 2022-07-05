package ooenCAPsulamento;

public class PessoaExec {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(24,"Bósnio");	
		p1.setIdade(-30);
		System.out.println(p1.getIdade());
		System.out.println(p1.getNome());
		System.out.println(p1.toString());
	}

}
