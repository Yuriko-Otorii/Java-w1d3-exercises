import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.print("Enter the number of your cents ");
        num = s.nextInt();
        int dollers = num / 100;
        int cents = num % 100;


        System.out.printf("%s%d%s%d%s%n", "The value is ", dollers, " dollars and ", cents, " cents");
        // System.out.println("The value is " + dollers + " dollars and " + cents + " cents");
    }
}
