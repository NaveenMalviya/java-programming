import java.util.*;
public class largestprime {
    public static int getLargestPrime(int number){
        int largestPrime=0;
        if(number<1){
            return -1;
        }else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                    if(isPrime(i)){
                        largestPrime=i;
                    }else{
                        continue;
                    }
                }else{
                    continue;
                }
            }
        }
        return largestPrime;
    }

    public static boolean isPrime(int number) {
        boolean flag = true;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        System.out.println(getLargestPrime(number));

        // System.out.println(isPrime(number));
        sc.close();
    }
}

