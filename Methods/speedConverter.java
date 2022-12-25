import java.util.*;
public class speedConverter{
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }else{
            return  Math.round(kilometersPerHour/1.609);
        }
    }

    public static void printConversion(double kilometersPerHour){
        long MilesPerHour=toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + MilesPerHour + " mi/h");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in km: ");
        double kilometersPerHour=sc.nextDouble();
        printConversion(kilometersPerHour);
        sc.close();
    }
}