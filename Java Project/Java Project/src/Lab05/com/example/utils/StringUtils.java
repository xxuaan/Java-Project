package Lab05.com.example.utils;

public class StringUtils {
    public static int countVowels(String input){
        int count =0;
        for (char ch : input.toLowerCase().toCharArray()){
            if("aeiou".indexOf(ch) != -1){
                count++;
            }
        }
        return count;
    }
}
