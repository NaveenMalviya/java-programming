import java.util.Scanner;

public class positiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        isPositiveOrNegative(num);
        sc.close();
    }

    // Driver method
    public static void isPositiveOrNegative(int num){
        if(num>0){
            System.out.println(num+" is positive.");
        }else if(num<0){
            System.out.println(num+" is negative.");
        }
        else{
            System.out.println(num+" is zero.");
        }
    }
}