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
		cjt.add("hehe");     // como hehe j� existe dentro do set, n�o conta como um novo item
		System.out.printf("O Set tem %d elementos\n", cjt.size());
		cjt.add("HEHE");                                                      // j� isso conta
		System.out.printf("O Set tem %d elementos\n", cjt.size());
		
		cjt.remove(true);
		System.out.printf("O Set tem %d elementos\n", cjt.size());
		cjt.remove("casa");                            // n�o faz parte do set ent�o nada muda
		System.out.printf("O Set tem %d elementos\n", cjt.size());
		System.out.println(cjt.remove("hehe"));       	    //hehe existia no set ent�o � true
		System.out.println(cjt.remove("hehe"));      //hehe n�o est� mais no set ent�o � false
		System.out.println(cjt.contains(4.5));               // o set cont�m 4.5, ent�o � true
		System.out.println(cjt.contains(true));            // o set n cont�m true, ent�o false
		
		System.out.println(cjt);
		
		Set numbros = new HashSet();
		numbros.add(1);
		numbros.add(5);
		numbros.add(10);
		numbros.add(71);
		numbros.add(12);
		
		System.out.println(numbros);
		
		cjt.addAll(numbros); // Fus�o de Set's
		System.out.println(cjt);
		
		cjt.retainAll(numbros);	
		System.out.println(cjt);  // cjt recebe apenas os itens em comum com numbros
		
		cjt.clear();
		System.out.println(cjt);  // limpar Set
	}

}
