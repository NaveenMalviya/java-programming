public class VarArgsMethod {
public static void sum(int... x){
    int total=0;
    for(int i=0;i<x.length;i++){
        total=total+x[i];
    }
    System.out.println("The sum is: "+ total);
}

public static void main(String[] args){
    sum(10,20,30,40,50);
}
}
