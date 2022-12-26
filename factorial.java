import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int factorial = 1;
        if (num == 1 || num == 0) {
            System.out.println("Factorial of " + num + " is " + factorial);
        } else {

            for (int i = num; i > 0; i--) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
            sc.close();
        }
    }
}
