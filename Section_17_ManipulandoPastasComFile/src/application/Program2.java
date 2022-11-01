package application;

import java.io.File;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file path: ");
        File path = new File(scanner.nextLine());

        System.out.println("GetName: " + path.getName());
        System.out.println("GetParent: " + path.getParent());
        System.out.println("GetPath: " + path.getPath());
        System.out.println("GetAbsolutePath: " + path.getAbsolutePath());
        System.out.println("GetTotalSpace: " + path.getTotalSpace());

        scanner.close();

    }
}
