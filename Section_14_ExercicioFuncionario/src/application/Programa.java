package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Informe o numero de funcionarios: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Informe os dados do funcionario: ");
			System.out.print("Terceirizado (s/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			int horas = sc.nextInt();
			System.out.print("Valor da hora trabalhada: ");
			double valorPorHora = sc.nextDouble();
			if (ch == 's') {
				System.out.print("Valor adicional: ");
				double adicional = sc.nextDouble();
				list.add(new FuncionarioTerceirizado(nome, horas, valorPorHora, adicional));
			}
			else {
				list.add(new Funcionario(nome, horas, valorPorHora));
			}
		}
		
		
		System.out.println("\n PAGAMENTO: ");
		for(Funcionario x  : list) {
			System.out.println(x.getNome() + " - $ " + x.pagamento());
		}
		
		sc.close();
		
		
	}
}
