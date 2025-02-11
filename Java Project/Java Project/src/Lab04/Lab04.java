import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab04 {
    public static void main(String[] args){
        String filePath = "/autograder/source/tests/lab04_input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            int ch;
            while( (ch = br.read()) != -1) {
                content.append((char) ch);
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