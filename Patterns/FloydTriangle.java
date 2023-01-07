import java.util.*;
public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows: ");
        int rows = sc.nextInt();
        int count=1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(count);
                count++;
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
