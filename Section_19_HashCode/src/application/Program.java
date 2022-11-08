package application;

import entities.Cliente;

public class Program {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("kelvin", "kelvin@hotmail.com");
		Cliente c2 = new Cliente("kelvin", "kelvin@hotmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	}

}
