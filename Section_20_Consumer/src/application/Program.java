package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;


public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * 1.1);
		
		list.add(new Product("TV",900.00));
		list.add(new Product("Mouse",50.00));
		list.add(new Product("Tabet",350.50));
		list.add(new Product("HD Case",80.90));
		
		/*	Usando implementação de interface:
		 * 		list.forEach(new PriceUpdate());
		 *	
		 *	Usando uma referencia para método estático:
		 *		list.forEach(Product::staticPriceUpdate);
		 *		
		 *
		 *	Usando uma referencia para método não estático:
		 *		list.forEach(Product::nonStaticPriceUpdate);
		 *	
		 *	Usando uma expressão lambda declarada:
		 *		list.forEach(consumer);
		 */

		
		list.forEach(consumer);
		list.forEach(System.out::println);
	}

}
