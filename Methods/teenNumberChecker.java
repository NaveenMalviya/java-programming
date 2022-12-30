import java.util.*;

public class teenNumberChecker {
    public static boolean hasTeenNumber(int a, int b, int c) {
        if ((a >= 13 || b >= 13 || c >= 13) && (a <= 19 || b <= 19 || c <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b and c: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        boolean result=hasTeenNumber(a, b, c);
        System.out.println(result);
        sc.close();
    }
}