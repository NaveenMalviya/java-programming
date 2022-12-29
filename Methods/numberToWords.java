import java.util.*;
public class numberToWords {
    public static int getDigitCount(int number) {
    if (number < 0) return -1;
    int digitCount = 0;
    while (number != 0) {
        digitCount++;
        number /= 10;
    }
    if (digitCount == 0) digitCount++;
    return digitCount;
    }

    public static int reverse(int number) {
        int reverse = 0;
        while(number != 0){
            reverse = (reverse * 10) + (number % 10);
            number = number / 10;
        }
        return reverse;
    }

    public static void numbersToWords(int number) {
        if(number<0){
            System.out.println("Invalid Value");
        }
        int count=getDigitCount(number);
        number = reverse(number);
        for (int i = count; i > 0; i--) {
            switch (number % 10) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
            }
            number /= 10;
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        numbersToWords(number);
        sc.close();
    }
}

