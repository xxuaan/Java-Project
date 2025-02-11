package Lab02;

public class lab02_Test {
    public static void main(String[] args){
        String modules = "CSC2102";
        switch (modules){
            case "CSC1106":
                System.out.println("Web Programming");
                break;
            case "CSC1109":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC2102":
                System.out.println("Professional Software Development");

            default:
                System.out.println("Unkwon Course Code");
                break;
        } System.out.println("After Switch");
    }
}
