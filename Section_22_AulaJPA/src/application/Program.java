package application;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "kelvin", "kelvin@emai.com");
		Pessoa p2 = new Pessoa(2, "paulo", "paulo@emai.com");
		Pessoa p3 = new Pessoa(3, "pedro", "pedro@emai.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
