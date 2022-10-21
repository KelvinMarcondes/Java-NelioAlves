package application;

import entities.Conta;
import entities.ContaBusiness;
import entities.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		ContaBusiness bacc = new ContaBusiness(1002, "Maria", 0.0, 500.0);

		
//			UPCASTING == puxar uma instancia da subclasse para a superclasse
		
	//	colondo uma ContaBusiness em uma Conta, pois uma ContaBusiness é uma Conta	
		Conta acc1 = bacc;			
		acc1.getSaldo();
		acc1.getNumero();
		acc1.getProprietario();
		
		Conta acc2 = new ContaBusiness(1003, "Bob", 0.0, 200.0);
		Conta acc3 = new ContaPoupanca(1004, "Pedro", 0.0, 0.01);
		
	
//		DOWNCASTING == converter um objeto da superclasse para subclasse. O compilador nao permite direto, pois nao sabe se é seguro a conversao
		
	//	ContaBusiness bacc1 = acc2;             				//	== O compilar nao permite.
		ContaBusiness bacc1 = (ContaBusiness) acc2;		//	== Informamos manualmente que vamos converter, mesmo com a possibilidade de nao ser seguro
		bacc1.emprestimo(100.0);									//	== agora posso fazer as operaçoes da *ContaBusiness* em uma conta que era apenas *Conta*
	
		
		
		
	//	ContaBusiness bacc2 = (ContaBusiness) acc3;		// == Tentiva de converter uma ContaPoupança em contaBusiness == ERRO. NÃO É POSSIVEL.   
																			// == Para fazer isso, usamos o IF com INSTANCEOF. Segue exemplo:
		
		System.out.println("USANDO O INSTANCEOF");
		if (acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc4 = (ContaPoupanca) acc3;
			acc4.atualizarSaldo();
			System.out.println("Atualizar saldo!");
		}
		
		if (acc3 instanceof ContaBusiness) {
			ContaBusiness acc4 = (ContaBusiness) acc3;
			acc4.emprestimo(0);
			System.out.println("Emprestimo!");
		}
		
		
		
		
// 		TESTANDO O OVERRIDE NA CONTAPOUPANCA E CONTABUSINESS
		
		System.out.print("\n \nTESTANDO O OVERRIDE NA CONTAPOUPANCA E CONTABUSINESS");
		 
		ContaPoupanca acc7 = new ContaPoupanca(1007, "kelvin", 100.0, 00.1);
		acc7.saque(10.0);
		System.out.println(acc7.getSaldo());
		
		ContaBusiness acc8 = new ContaBusiness(1008, "Souza", 100.0, 200.0);
		acc8.saque(10.0);
		System.out.println(acc8.getSaldo());
		
		Conta acc9 = new Conta(1009, "marcondes", 100.0);
		acc9.saque(10.0);
		System.out.println(acc9.getSaldo());
		
		
		
// 		SOBRE POLIMORFISMO == COMPORTAMENTOS DIFERENTES PARA OBJETOS DO MESMO TIPO.
		
		System.out.println("\n \nSOBRE POLIMORFISMO");
		
		Conta x = new Conta(1010, "Henrique", 200.0);
		Conta y = new ContaPoupanca(1011, "Fernando", 200.0, 0.01);
		
		x.saque(50.0);
		y.saque(50.0);
		
		System.out.println(x.getSaldo());
		System.out.println(y.getSaldo());
	
	}

}
