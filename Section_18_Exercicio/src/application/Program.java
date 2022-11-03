package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int number = scanner.nextInt();
        System.out.print("Data(dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.next(),fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = scanner.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Entre com numero de parcelas: ");
        int parcelas = scanner.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(obj, parcelas);

        System.out.println("Parcelas: ");
        for (Installment installment : obj.getInstallments()){
            System.out.println(installment);
        }

        scanner.close();

    }
}
