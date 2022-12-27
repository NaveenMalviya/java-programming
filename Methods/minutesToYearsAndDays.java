import java.util.*;
public class minutesToYearsAndDays {
    public static void printYearsAndDays(long minutes) {
        long years=minutes/525600;
        long remain_minutes=(minutes-(years*525600));
        long days=remain_minutes/1440;
        if(minutes<0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(minutes + " min = "+ years + " y and " + days +" d");
        }
    }


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter minutes: ");
        long minutes=sc.nextLong();
        printYearsAndDays(minutes);
        sc.close();
    }
}
