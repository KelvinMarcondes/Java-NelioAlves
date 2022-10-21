package application;

import entities.Conta;
import entities.ContaBusiness;

public class Programa {

	public static void main(String[] args) {
		
		Conta acc = new Conta(1001, "Alex", 0.0);
		ContaBusiness bacc = new ContaBusiness(1003, "Maria", 0.0, 500.0);
		
		//UPCASTING == puxar uma instancia da subclasse para a superclasse

	}

}
