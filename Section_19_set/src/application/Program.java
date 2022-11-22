package application;

import java.util.LinkedHashSet;
import java.util.Set;

/*
			 * 	Representa um conunto de elementos (similar a a algebra)
			 * 
			 *	 	Não adimite repetiçoes
			 * 		Elementos nao possuem posição
			 * 		Acesso, inserção e remoção de elementos são rápidos
			 * 		Oferece operações eficientes de conjunto: inserção, união, diferença
			 * 		
			 * 		Principais implementações:
			 * 			HashSet - Mais rapido(Operação O(1) em tabela hash) e não ordenado
			 * 			TreeSet - Mais lento(Operação O(log(n)) em arvore rubro negra) e ordenado pelo compareTo do objeto(ou Comparator)
			 * 			LinkedHashSet - Velocidade intermediaria e elementos na ordm em que são adicionados			
			 * 
			 * 	Alguns métodos importantes
			 * 		Add(obj), remove(obj), contains (obj)	
			 * 			Baseado em equals e hashcode
			 * 			Se equals e hashcode nao existir, é usada comparação de ponteiros
			 * 		
			 * 		clear()
			 * 		size()
			 * 		removeIf(predicate)
			 *		
			 *		addAll(other) -união: adiciona no conjunto os elementos do outro conjunto, sem repetição
			 *		retainAll(other) - interseção: remove do conjunto os elementos nao contidos em other
			 * 		removeAll(other) - diferença: remove do conjnto os elementos contidos em other
			 * 
			 * 
			 */

public class Program {
	
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();

		
		set.add("tv");
		set.add("notebook");
		set.add("tablet");
		
		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 't');
		
		System.out.println("For LinkedHashSet");
		System.out.println(set.contains("notebook"));
		for (String p : set) {
			System.out.println(p);
		}
		
	}

}
