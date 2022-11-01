package application;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter the Folder path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        assert folders != null;
        for (File folder : folders) System.out.println(folder);

        System.out.println("Files: ");
        File[] files = path.listFiles(File::isFile);
        assert files != null;
        for (File ignored : files) System.out.println(Arrays.toString(files));




        scanner.close();

    }
}
