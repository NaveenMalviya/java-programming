import java.util.*;
public class inputCalculator{
    public static void inputThenPrintSumAndAverage(){
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int count=0;
        while(true){
            System.out.println("Enter a number to continue or a character to quit: ");
            try{
                int num=sc.nextInt();
                sum=sum+num;
                count++;
            }catch(InputMismatchException e){
                System.out.println("Invalid Value.");
                break;
            }
        }
        int avg=sum/count;
        System.out.println("SUM = "+sum+" AVG = "+avg);
        sc.close();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        inputThenPrintSumAndAverage();
        sc.close();
    }
}