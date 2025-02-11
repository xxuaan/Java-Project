package Lab03;

public class MathExample {
    public static void main(String[] args){
        double a = 25;
        double b = 9;

        //Square root
        System.out.println("Square root of " + a + ": " + Math.sqrt((a)));

        //power
        System.out.println("Power (a^b)");

        // Min and Max
        int x = 8, y = 12;
        double sum;
        System.out.println("Min of x, y: " + Math.min(x,y));
        System.out.println("Min of x, y: " + Math.max(x,y));

        sum = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        System.out.println("ANS " + sum);

    }
}
