package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[]args){

        File file = new File("E:\\Workspaces\\Workspace-IntelliJ\\CourseJAVA\\Section_17_Text_File_Scanner\\file.txt");

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nend code");
    }
}
