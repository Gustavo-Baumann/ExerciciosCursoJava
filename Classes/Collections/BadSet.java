package Collections;

import java.util.HashSet;

import java.util.Set;

public class BadSet {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet cjt = new HashSet();
		
		cjt.add("hehe");
		cjt.add(369);
		cjt.add(true);
		cjt.add(4.5);
		

		System.out.printf("O Set tem %d elementos\n", cjt.size());
		cjt.add("hehe");     // como hehe já existe dentro do set, não conta como um novo item
		System.out.printf("O Set tem %d elementos\n", cjt.size());
		cjt.add("HEHE");                                                      // já isso conta
		System.out.printf("O Set tem %d elementos\n", cjt.size());
		
		cjt.remove(true);
		System.out.printf("O Set tem %d elementos\n", cjt.size());
		cjt.remove("casa");                            // não faz parte do set então nada muda
		System.out.printf("O Set tem %d elementos\n", cjt.size());
		System.out.println(cjt.remove("hehe"));       	    //hehe existia no set então é true
		System.out.println(cjt.remove("hehe"));      //hehe não está mais no set então é false
		System.out.println(cjt.contains(4.5));               // o set contém 4.5, então é true
		System.out.println(cjt.contains(true));            // o set n contém true, então false
		
		System.out.println(cjt);
		
		Set numbros = new HashSet();
		numbros.add(1);
		numbros.add(5);
		numbros.add(10);
		numbros.add(71);
		numbros.add(12);
		
		System.out.println(numbros);
		
		cjt.addAll(numbros); // Fusão de Set's
		System.out.println(cjt);
		
		cjt.retainAll(numbros);	
		System.out.println(cjt);  // cjt recebe apenas os itens em comum com numbros
		
		cjt.clear();
		System.out.println(cjt);  // limpar Set
	}

}
