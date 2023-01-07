import java.util.*;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows and columns");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns-i; j++) {

                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
