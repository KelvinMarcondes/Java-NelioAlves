package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class ProgramOrder {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Client cli = new Client("maria", "maria@test.com", sdf.parse("12/09/2022"));
		
		System.out.println(cli);
		
		sc.close();
	}

}
