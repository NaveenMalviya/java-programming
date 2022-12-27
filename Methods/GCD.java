import java.util.*;
public class GCD {
    public static int getGreatestCommonDivisor(int first, int second) {
        int a = first;
        int b = second;
        int min = 0;
        int result = 0;
        if (a < 10 || b < 10) {
            return -1;
        } else {
            if (a < b) {
                min = a;
            } else {
                min = b;
            }

            for (int i = 2; i <= min; i++) {
                if (a % i == 0) {
                    if (b % i == 0) {
                        result = i;
                    } else {
                        continue;
                    }
                }
                continue;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first=sc.nextInt();

        System.out.println("Enter second number: ");
        int second=sc.nextInt();
        
        System.out.println(getGreatestCommonDivisor(first, second));
        sc.close();
    }

}
