import java.util.Scanner;
public class swapNumbersWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();
        System.out.println("Numbers before Swapping are "+a+" and "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Numbers after Swapping are "+a+" and "+b);
        sc.close();
    }
}
