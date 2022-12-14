package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;




public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		
		list.add(new Product("TV",900.00));
		list.add(new Product("Mouse",50.00));
		list.add(new Product("Tabet",350.50));
		list.add(new Product("HD Case",80.90));
		
		/*	Usando implementação de interface:
		 * 		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		 *		names.forEach(System.out::println);
		 *
		 *	Usando uma referencia para método estático:
		 *		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		 *		names.forEach(System.out::println);
		 *
		 *	Usando uma referencia para método não estático:
		 *		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		 *		names.forEach(System.out::println);
		 *	
		 *	Usando uma expressão lambda declarada:
		 *		Function<Product,	String> function = p -> p.getName().toUpperCase();
		 *		List<String> names = list.stream().map(function).collect(Collectors.toList());
		 *		names.forEach(System.out::println);
		 */

		Function<Product,	String> function = p -> p.getName().toUpperCase();
		List<String> names = list.stream().map(function).collect(Collectors.toList());
		names.forEach(System.out::println);
		

		

	}

}
