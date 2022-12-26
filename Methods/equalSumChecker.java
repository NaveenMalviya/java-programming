import java.util.*;
public class equalSumChecker {
    public static boolean hasEqualSum(int a,int b, int c){
        if(a<0||b<0||c<0){
            return false;
        }else{
            if(a+b==c||b+c==a||a+c==b){
                return true;
            }else{
                return false;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b and c: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        boolean result=hasEqualSum(a, b, c);
        System.out.println(result);
        sc.close();
    }
}
