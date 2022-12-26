import java.util.*;
public class decimalConverter {
    public static boolean areEqualByThreeDecimalPlaces(double first , double second){
        if((int) (first*1000)==(int) (second*1000)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        double first=sc.nextDouble();

        System.out.println("Enter second number: ");
        double second=sc.nextDouble();

        boolean result=areEqualByThreeDecimalPlaces(first,second);
        System.out.println(result);
        sc.close();
    }
}
