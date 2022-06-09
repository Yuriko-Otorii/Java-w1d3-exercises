import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.print("Input a number: ");

        num = s.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d%s%d%s%d%n", num, " × ", i, " = ", num*i);
        }
    }
}
