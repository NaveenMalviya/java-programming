import java.util.*;
public class sumOfOdd {
    public static boolean isOdd(int number){
        if(number%2==0){
            return false;
        }else{
            return true;
        }
    }

    public static int sumOdd(int start, int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(isOdd(i)){
                sum=sum+i;
            }else{
                continue;
            }
        }
        return sum;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range\n start form: ");
        int start=sc.nextInt();
        System.out.println("End at: ");
        int end=sc.nextInt();
        System.out.println(sumOdd(start, end));
        sc.close();

    }
}
