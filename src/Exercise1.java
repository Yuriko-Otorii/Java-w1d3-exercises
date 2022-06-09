import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int num;

        System.out.print("Enter the radius ");
        num = s.nextInt();
        
        System.out.println("The are is " + num * num * Math.PI);

    }
}
