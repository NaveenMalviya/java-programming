import java.util.*;
public class perfectNumber {
    public static boolean isPerfectNumber(int number){
        int sum=0;
        if(number<1){
            return false;
        }else{
            for(int i=1;i<number;i++){
                if(number%i==0){
                    sum=sum+i;
                }else{
                    continue;
                }
            }
            if(sum==number){
                return true;
            }else{return false;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        System.out.println(isPerfectNumber(number));
        sc.close();
    }
}
