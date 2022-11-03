package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do carro: ");
		System.out.print("Modelo: ");
		String carModel = scanner.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), fmt);
		System.out.print("Entrega (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(),fmt);
		
		
		CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = scanner.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = scanner.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(carRental);
		System.out.println("Fatura: ");
		System.out.println("Pagamento básico: " + carRental.getInvoice().getBasicPayment());
		System.out.println("Imposto: " + carRental.getInvoice().getTax());
		System.out.println("Pagamento total: " + carRental.getInvoice().getTotalPayment());

		scanner.close();
		
		
	}

}
