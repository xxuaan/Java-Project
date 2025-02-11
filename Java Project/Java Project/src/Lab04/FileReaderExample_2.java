package Lab04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample_2 {
    public static void main(String[] args){
        String filePath = "src/Lab04/lab04_input.txt";
        int lineCount = 0;
        int wordCount = 0;
        int GlasgowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+");
                for (String word : words){
                    String glasgow = "Glasgow";
                    word = word.replaceAll("[^a-zA-Z]", "");
                    if (word.equals(glasgow)){
                        GlasgowCount++;
                    }
                }
                wordCount += words.length;
                System.out.println(line);
            }
            System.out.println("total lines: " + lineCount);
            System.out.println("total words: " + wordCount);
            System.out.println("total Glasgow: " + GlasgowCount );
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


