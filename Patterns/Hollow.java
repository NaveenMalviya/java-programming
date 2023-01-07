import java.util.*;
public class Hollow {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of rows and columns");
    int rows=sc.nextInt();
    int columns=sc.nextInt();
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=columns;j++){
            if(i==1||i==rows||j==1||j==columns){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    sc.close();
    }
}
