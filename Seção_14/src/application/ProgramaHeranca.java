package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class ProgramaHeranca {

	public static void main(String[] args) {
		
		Account acc = new Account(1001,"Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.0);
		
		//UPCASTING (converter da subclasse para superclasse)
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003,"pedro", 100.0, 50.0);
		Account acc3 = new SavingAccount(1004, "Ana", 0.0, 0.01);
				
		
	// DOWNCAST converter da superclasse para subclasse
		
	/* 
	 * Abaixo da erro pq o compilador nao sabe se é seguro essa conversao	
	 * BusinessAccount acc4 = acc2;
	*/
	
	//Abaixo eu forço uma conversão
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
	/*
	 * Ao onverter uma subclasse para outra subclasse, nem sempre da certo e o compilador nao reclama, mas ao executar da erro. 
	 * BusinessAccount acc5 = (BusinessAccount) acc3;
	 * 
	 * 
	 * Como evitar esse erro? Usar um if para verificar o tipo com o instanceof*/
	
		
		//Esse if falha pois acc3 nao é do tipo BusinessAccount
		if (acc3 instanceof BusinessAccount) {
		BusinessAccount acc5 = (BusinessAccount) acc3;
		acc5.loan(200);
		System.out.println("Loan!");
		}
		
		//Esse if faz a operação pois acc3 é do tipo de SavingAccount
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
			}
		
		System.out.println("\n Aula sobre sobreposiçao, palavra super e anotação override \n");
		
		Account acc6 = new Account(1006,"fernanda", 1000.0);
		acc6.withDraw(200.0);
		System.out.println("acc6 saldo em conta: " + acc6.getBalance() + " == usando metodo padrao de withdraw de Accont");
		
		Account acc7 = new SavingAccount(1007, "pedro", 1000.0, 0.01);
		acc7.withDraw(200.0);
		System.out.println("acc7 saldo em conta: " + acc7.getBalance() + " == usando metodo override de withdraw da classe SavingAccount");
		
		Account acc8 = new BusinessAccount(1008, "joao", 1000.0, 300.0);
		acc8.withDraw(200);
		System.out.println("acc8 saldo em conta: " + acc8.getBalance() + " == usando o metodo override de withdraw da classe BusinessAccount");
		
	
	}
}
