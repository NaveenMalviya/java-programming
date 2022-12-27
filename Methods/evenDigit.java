import java.util.*;
public class evenDigit {
    public static int getEvenDigitSum(int number){
        int EvenSum = 0;
        int checkDigit = 0;
        if (number < 0){
            return -1;
        }
        while (true){
            checkDigit = number % 10;
            if (checkDigit % 2 == 0){
                EvenSum += checkDigit;
            }
            number = number / 10;
            if (number == 0){
                break;
            }
        }
        return EvenSum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        System.out.println(getEvenDigitSum(number));
        sc.close();
    }

}
