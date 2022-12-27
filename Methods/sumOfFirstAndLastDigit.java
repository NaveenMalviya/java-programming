import java.util.*;
public class sumOfFirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number){
        int firstDigit = 0;
        int lastDigit = number % 10;
        if (number < 0){
            return -1;
        }
        
        while (true){
            firstDigit = number % 10;
            number = number /10;
            if (number == 0){
                break;
            }
        }
        return firstDigit + lastDigit;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        System.out.println(sumFirstAndLastDigit(number));
        sc.close();
    }
}
