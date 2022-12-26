import java.util.*;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of number: ");
        int size=sc.nextInt();
        System.out.println("Enter a number: ");
        long num=sc.nextInt();
        long temp=0; //temporary variable
        for(int i=1;i<=size;i++){
            temp=num%10;
            num=num/10;
            System.out.println(temp);
        }

        sc.close();
    }
}
