package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Cor;

public class Programa {

	public static void main(String[] args) {
		
		List<Forma> list = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas figuras?");
		int n = sc.nextInt();
		
		for (int i =1; i <= n ; i++) {
			System.out.println("Forma da figura #" + i + ":");
			System.out.print("Retangulo ou circulo (r/c)?");
			char rc = sc.next().charAt(0);
			System.out.print("Cor (BLACK/ BLUE/ RED)");
			Cor cor = Cor.valueOf(sc.next());
		
			if(rc == 'r') {
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				list.add(new Retangulo(cor, altura, largura));
			}
			else {
				System.out.print("raio: ");
				double raio = sc.nextDouble();
				list.add(new Circulo(cor, raio));
			}
		}
		
		System.out.println("\n Area das formas: ");
		for (Forma forma : list) {
			System.out.print(String.format ("%.2f", forma.area()));
		}
		
		sc.close();
	}

}
