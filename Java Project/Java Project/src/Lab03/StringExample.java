package Lab03;

public class StringExample {
    public static void main(String[] args){
        String greeting = "Hello, Java Students!";
        System.out.println("Original: " + greeting);

        //Concatenation
        String welcome = greeting.concat(" Welcome to the lab.");
        System.out.println("Concatenated: " + welcome);

        //Substring
        String java = greeting.substring(7,12);
        System.out.println("Substring: " + java);

        // Uppercase
        String upper = greeting.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // Replacement
        String replaced = greeting.replace("J","G");
        System.out.println("Replaced: " + replaced);

        // Count number of vowels
        int count = 0;
        String str = "Laboratory Exercise Completed!";
        str = str.toLowerCase();
        for (int i=0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u'){
                count++;
            }
//            System.out.println("for loop " + i + ": " + str.charAt(i));
        }
        System.out.println("Total number of vowels in string are " + count);
    }
}
