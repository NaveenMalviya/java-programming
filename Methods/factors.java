import java.util.*;
public class factors {
    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }else{
            for(int i=1;i<=number;i++){
                if(number%i==0){
                    System.out.println(i);
                }else{
                    continue;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        printFactors(number);
        sc.close();
    }
}
