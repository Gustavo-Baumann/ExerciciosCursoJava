package fundamentos;

import javax.swing.JOptionPane;

public class Conversao {
	
	public static void main(String[] args) {
		
		int valor01 = 100;
		byte valor02 = (byte) valor01;
		System.out.println(valor02);
	
		double valor03 = 1.234;
		int valor04 = (int) valor03;
		System.out.println(valor04);
		//valor fracionado foi perdido na conversao
		
		int valor05 = 10;
		System.out.println(Integer.toString(valor05));
		//de int pra integer pra string
		
		String valor06= JOptionPane.showInputDialog("say a number");
		System.out.println(valor05 + valor06);
		//como valor06 é string , não é somado
		
		double valor07 = Double.parseDouble(valor06);
		System.out.println(valor03 + valor07);
		
		int valor08 = Integer.parseInt(valor06);
		System.out.println(valor08);
		//vai dar erro caso valor06 nao for inteiro
		
		String valor09 = JOptionPane.showInputDialog("say another number");
		double valor10 = Double.parseDouble(valor09);
		System.out.println(valor10);
	}
}
