import java.util.*;
public class leapYearCalculator {
    public static boolean isLeapYear(int year){
        if(year<0 || year>9999){
            return false;
        }else{
            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        return true;
                    }
                    else{
                        return false;
                    }
                }else{
                    return true;
                }
            }else{
                return false;
            }
        }
    }


    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the year which you want to check:");
      int year=sc.nextInt();
      boolean result=isLeapYear(year);
      System.out.println(result);
      sc.close();
    }
}
