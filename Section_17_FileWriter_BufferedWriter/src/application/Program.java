package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        String[] lines = new String[]{"Bom Dia!","Boa Tarde!","Boa noite!"};

        String path = "E:\\temp\\aula217.txt";

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))){
            for (String line :
                 lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
