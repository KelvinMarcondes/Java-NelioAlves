package application;

import entities.Product;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        System.out.println("Enter file path: ");
        String sourceFileStr = scanner.nextLine();

        File souFile = new File(sourceFileStr);


        scanner.close();


    }
}
