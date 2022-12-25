import java.util.*;
public class mbConverter {
    public static void printMegaBytesAndKiloBytes(int kb){
        if(kb<0){
            System.out.println("Invalid Value");
        }else{
            int mb=kb/1024;
            int rem_kb=kb%1024;
            System.out.println(kb + " KB = " + mb + " MB and " + rem_kb + " KB");
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter kb: ");
        int kb=sc.nextInt();
        printMegaBytesAndKiloBytes(kb);
        sc.close();
    }
}
