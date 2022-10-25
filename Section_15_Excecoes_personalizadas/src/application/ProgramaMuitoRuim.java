			/*
			 
			 
			 		
		ESSE É MODO MUITO RUIM DE FAZER ESSAS RESERVAS. NÃO RECOMENDADO.
			 
			 
		Problema exemplo
			
		Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data
		de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em
		dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
		novamente a reserva com os dados atualizados. O programa não deve aceitar dados
		inválidos para a reserva, conforme as seguintes regras:

		- Alterações de reserva só podem ocorrer para datas futuras
		- A data de saída deve ser maior que a data de entrada
		

		
		*/

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class ProgramaMuitoRuim {

	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero do quarto: ");
		int numeroQuarto =  sc.nextInt();
		System.out.print("Data do checkin: ");
		Date checkin = sdf.parse(sc.next());
		System.out.print("Data do checkout: ");
		Date checkout = sdf.parse(sc.next());
	
		if(checkin.after(checkout)) {
			System.out.println("Data invalida. Checkin precisa ser antes do checkout");
		}
		else {
			Reserva reserva = new Reserva(numeroQuarto, checkin, checkout);
			System.out.println("Reserva: " + reserva);
			
			System.out.print("Entre com a data deatualização");
			System.out.print("Data do checkin(dd/mm/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.print("Data do checkout(dd/mm/yyyy): ");
			checkout = sdf.parse(sc.next());
			
			Date now = new Date();
			if (checkin.before(now)  || checkout.before(now)) {
				System.out.println("Data invalida. As datas de atualização devem ser futuras.");
			}
			else if(checkin.after(checkout)) {
				System.out.println("Data invalida. Checkin precisa ser antes do checkout");
			}
			else {
			reserva.atualizaDatas(checkin, checkout);
			System.out.println("Reserva: " + reserva);
			}
		}
		sc.close();
	}
}