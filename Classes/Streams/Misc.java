package Streams;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Misc {
	
	private Misc() {
		
	}

	public final static String grito(String n) {
		return n + " lasquera!!";
	}
	public final static UnaryOperator<String> upCase = n -> n.toUpperCase();
	public final static UnaryOperator<String> inicial = n -> n.charAt(0) + "";
	public final static Predicate<Carros> rapido = c -> c.velocidadeMaxima >= 200;
	public final static Predicate<Carros> green = c -> c.eletrico == true;
	public final static Function<Carros,String> daora = c -> "O Carro da " + c.nome + " é daora";
	public final static BinaryOperator<Double> somaDouble = (ac, n) -> ac + n;
	public final static BinaryOperator<Integer> somaInt = (ac, n) -> ac + n;
	public final static Predicate<Aluno> aprovado = a -> a.nota >= 7;
	public final static Predicate<Aluno> reprovado = Misc.aprovado.negate();
	public final static Function<Aluno, Double> getNota = a -> a.nota;
	public final static BinaryOperator<Double> mediaDouble = (a,b) -> (a + b) / 2;
	public final static BinaryOperator<Integer> mediaInt = (a,b) -> (a + b) / 2;
	public final static Function<Integer, String> converterParaString = n -> Integer.toString(n,2);
	public final static UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
	public final static Function<String, Integer> converterParaInteger = n -> Integer.parseInt(n,2);
}
