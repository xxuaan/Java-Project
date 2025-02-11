package Lab05.com.example.encapsulation;

import Lab05.com.example.utils.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        Person person = new Person(name, age, email);

        System.out.println(name + " " + age + " " + email);

        scanner.close();
    }
}
