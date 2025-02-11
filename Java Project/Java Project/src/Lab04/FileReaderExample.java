package Lab04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args){
        String filePath = "src/Lab04/lab04_input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            int c;
            while( (c = br.read()) != -1) {
                content.append((char) c);
            }

            // Reverse the entire character sequence
            String reversed = content.reverse().toString();

            System.out.println(reversed);
}

        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


