import java.util.*;
public class NumericPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows and columns");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        for (int i = 1; i <= rows+1; i++) {
            for (int j = 1; j <=columns-i+1 ; j++) {

                System.out.print(j);
            }
            System.out.println(" ");
        }
        sc.close();
    }
}

