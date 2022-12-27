import java.util.*;
public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        } else{
            int firstdigitnum1 = num1 / 10;
            int lastdigitnum1 = num1 % 10;
            
            int firstdigitnum2 = num2 / 10;
            int lastdigitnum2 = num2 % 10;
            
            if (firstdigitnum1 == firstdigitnum2 || firstdigitnum1 == lastdigitnum2 || lastdigitnum1 == firstdigitnum2 || lastdigitnum1 == lastdigitnum2){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first and second numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(hasSharedDigit(num1, num2));
        sc.close();
    }
}