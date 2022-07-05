package fundamentos;

public class string {
	public static void main(String[] args) {
		
		String nome = "Nay";
		nome = nome.replace("a","e");
		nome = nome.toUpperCase();
		nome = nome.concat("ZIKA");
		System.out.println(nome); 
		
		String binladen = "ruim";;
		System.out.println(binladen);
		binladen = binladen.replace("ruim", "bom");
		System.out.println(binladen);
		
		String name = "Gustavo"
				.replace("a", "o")
				.toUpperCase()
				.concat("BAUMANN");
        System.out.println(name);
	}
}
