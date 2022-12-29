import java.util.*;
public class flourPacker {
    public static boolean canPack(int bigCount, int smallCount,int goal){
        bigCount=bigCount*5;
        smallCount=smallCount*1;

        if(bigCount<0||smallCount<0||goal<0){
            return false;
        }else if(bigCount+smallCount==goal){
            return true;
        }else{
            if(bigCount+smallCount>goal&& smallCount>=goal%5) {
                return true;
            }else{
                return false;
            }
        }
    }

        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter bigCount: ");
        int bigCount=sc.nextInt();
        System.out.println("Enter smallCount: ");
        int smallCount=sc.nextInt();
        System.out.println("Enter goal: ");
        int goal=sc.nextInt();
        System.out.println(canPack(bigCount,smallCount,goal));
        sc.close();
    }
}
