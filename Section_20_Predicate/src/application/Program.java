package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		Predicate<Product> predicate = p -> p.getPrice() >= 100.0;
		
		list.add(new Product("TV",900.00));
		list.add(new Product("Mouse",50.00));
		list.add(new Product("Tabet",350.50));
		list.add(new Product("HD Case",80.90));
		
	/*	Usando expressão lambda comum:	
	 * 		list.removeIf(p -> p.getPrice() >= 100.0);
	 * 
	 *	Usando implementação de interface:
	 * 		list.removeIf(new ProductPredicate());
	 *	
	 *	Usando uma referencia para método estático:
	 *		list.removeIf(Product::StaticProductPredicate);
	 *
	 *	Usando uma referencia para método não estático:
	 *		list.removeIf(Product::NonStaticProductPredicate);
	 *	
	 *	Usando uma expressão lambda declarada:
	 *		list.removeIf(predicate);
	 */
		
		list.removeIf(predicate);
		
		for (Product product : list) System.out.println(product);
		
		
	}

}
