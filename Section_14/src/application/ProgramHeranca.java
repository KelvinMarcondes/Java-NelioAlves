package application;

import entities.AccountHeranca;
import entities.BusinessAccountHeranca;
import entities.ContaPoupancaHeranca;

public class ProgramHeranca {

	public static void main(String[] args) {
		
		AccountHeranca acc = new AccountHeranca(1001, "alex", 0.0);
		BusinessAccountHeranca bacc = new BusinessAccountHeranca(1002, "maria", 0.0, 500.0);
		
		
		
		//UPCASTING == FAZER UM OBJETO DA SUBCLASSE VIRAR UM DA SUPERCLASSE
		AccountHeranca acc1 = bacc;
		AccountHeranca acc2 = new BusinessAccountHeranca(1003, "Bob", 0.0, 200.0);
		AccountHeranca acc3 = new ContaPoupancaHeranca(1004, "Anna", 0.0, 0.01);
		
		
		
		//DOWNCASTING == FAZER UM OBJETO DA SUPERCLASSE VIRAR UM DA SUBCLASE
		
	//	BusinessAccountHeranca acc4 = acc2;			O compilador reclama pois naos abe se é seguro converter
		BusinessAccountHeranca acc4 = (BusinessAccountHeranca) acc2;		//assim, forcamos a conversao com um casting manual
	}

}
