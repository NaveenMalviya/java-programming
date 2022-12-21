import java.util.Scanner;
public class swapNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();

        System.out.println("Numbers before swapping are "+a+" and "+b); 
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        
        System.out.println("Numbers after swapping are "+a+" and "+b); 
        sc.close();
    }
}
