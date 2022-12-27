import java.util.*;
public class palindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit = 0;
        int num = number;
        while (true){
            lastDigit = num % 10;
            reverse += lastDigit;
            num = (int) num / 10;
            if (num ==0){
                break;
            }
            reverse *= 10;
        }
        if (number == reverse){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        System.out.println(isPalindrome(number));
        sc.close();
    }
        
    }
}
