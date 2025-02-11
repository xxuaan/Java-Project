package Lab02;

public class Lab02 {
    public static void main(String[] args) {
        // Part 1
        System.out.println("Hello, Xuan");

        //Part 2
        String modules = "CSC1109";
        switch (modules) {
            case "CSC1106":
                System.out.println("Web Programming");
                break;
            case "CSC1109":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC2102":
                System.out.println("Professional Software Development");

            default:
                System.out.println("Unknown Course Code");
                break;
        }
//        System.out.println("After Switch");

        //Part 3
        int START_NUM = 102;
        int END_NUM = 66;
        for (int i = START_NUM - 1; i >= END_NUM; i = i - 2) {
            System.out.println(i);
        }

//        for (int i = START_NUM; i >= END_NUM; i--) {
//            if (i % 2 != 0) {
//                System.out.println(i + " ");
//            }
//        }
    }
}

/*
Questions:
1. What Java construct is used to print your name, and where should it be placed within the class file PersonalGreeting.java?
ANS:
- Java construct is the line " System.out.println("Hello, Aris"); "
- it is the output construct that performs the task of displaying the text as per the question requirements.
- It is placed inside the main method.

2. Which programming structure is utilized to handle different module codes, and how would you update it as per the instructions?
ANS:
- The switch structure is used to handle different module codes.
- Change the "String modules" variable based on the desired outcome/needs.

3. How can you implement a for loop to print only the odd numbers between 102 and 66 in descending order in the OddNumbers.java class?
- START_NUM - 1 ensures the loop starts from 101 (the first odd number below 102).
- The condition i >= END_NUM ensures the loop stops when the number drops below 66.
- The i -= 2 decrements by 2 to print odd numbers only.
*/