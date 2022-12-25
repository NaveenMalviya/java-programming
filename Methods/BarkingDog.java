import java.util.*;
public class BarkingDog {
    public static boolean isBarking(boolean barking, int hourOfDay){
        if(hourOfDay<0||hourOfDay>23){
            return false;
        }else{
            if(barking==true && hourOfDay<8|| hourOfDay>23){
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Write true if dog is barking otherwise write false: ");
        boolean barking=sc.nextBoolean();
        System.out.println("Enter the hour of current time: ");
        int hourOfDay=sc.nextInt();
        boolean result=isBarking(barking, hourOfDay);
        System.out.println(result);
        sc.close();

    }
}
