import java.util.*;
public class equalityPrinter {
    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else if (x == y && x == z && y == z) {
            System.out.println("All numbers are equal");
        } else if (x != y && x != z && y != z) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of x,y and z");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        printEqual(x, y, z);
        sc.close();
    }
}
