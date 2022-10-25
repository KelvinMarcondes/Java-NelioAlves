import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	

	public static void main(String[] args) {
		System.out.println("inicio");
		metodo1();
		System.out.println("fim");
	}
	
		public static void metodo1() {
			System.out.println("inicio metodo 1");
			metodo2();
			System.out.println("fim metodo 1");
			}
	
		public static void metodo2() {
			
			System.out.println("inicio metodo 2");
			
			Scanner sc = new Scanner(System.in);
			
			try {
				String[] vect = sc.nextLine().split(" ");
				int position = sc.nextInt();
				System.out.println(vect[position]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Posição invalida!");
				e.printStackTrace();									//imprime o tipo da exception e onde aconteceu, após isso, continua o programa por conta do try catch
			}
			catch(InputMismatchException e) {
				System.out.println("Entrada invalida!");
			}
			sc.close();
			
			System.out.println("final metodo 2");
	}

}
