package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Conta;
import entities.ContaBusiness;
import entities.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Conta> list = new ArrayList<>();
		
		list.add(new ContaPoupanca(1001, "kelvin", 500.0, 0.01));
		list.add(new ContaBusiness(1002, "souza", 500.0, 200.0));
		list.add(new ContaPoupanca(1003, "nnnnin", 1000.0, 0.01));
		list.add(new ContaBusiness(1003, "aaaaa", 5000.0, 400.0));
		
		
		double sum =0;
		for(Conta x : list) {
			sum += x.getSaldo();
		}
		System.out.println("Soma de todas as contas: " + sum);
		
		for(Conta x : list) {
			x.deposito(10.0);
		}
		
		System.out.println("\nAdicionando 10.0 em todas as contas:");
		for(Conta x : list) {
			System.out.println("Conta: " + x.getNumero() + " Saldo: " + x.getSaldo());
		}


	}

}
