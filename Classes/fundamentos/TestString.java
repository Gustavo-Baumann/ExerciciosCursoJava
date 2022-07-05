package fundamentos;

public class TestString {
	public static void main(String[] args) {
		
		String bd = "Bom Dia";
		System.out.println(bd.toUpperCase());
		System.out.println(bd.charAt(2));
		System.out.println(bd.toLowerCase());
		System.out.println(bd.startsWith("b"));
		System.out.println(bd.length());
		bd = "Boa Tarde";
		System.out.println(bd);
		System.out.println(bd.replace("a", "e"));
		System.out.println(bd.equals("boa tarde"));
		System.out.println(bd.equalsIgnoreCase("boa tarde"));
		
		var nome = "Gustavo";
		var nick = "Nay";
		var idade = 21;
		
		System.out.println("Nome: " + nome + "\nNick: " + nick + "\nIdade: " + idade);
		System.out.printf("O Sr. %s ,conhecido como %s , tem %d anos de idade" , nome, nick, idade);
		
		String frase = String.format("\nNome: %s", nome);
		System.out.println(frase);
		String frase2 = String.format("Nick: %s", nick);
		System.out.println(frase2);
		
		System.out.println("  ");
		
		String anotherOne = "Nome: " + nome + "\nNick: " + nick + "\nIdade: " + idade;
		System.out.println(anotherOne);
		
		
	}
}
