package Lab04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderExample_3 {
    public static void main(String[] args){
        String filePath = "src/Lab04/lab04_input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            ArrayList<String> list = new ArrayList<String>();
            while( (line = br.readLine()) != null) {
                if (!(line.startsWith("#"))){
                    list.add(line);
                }
            }
            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
        }

        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


