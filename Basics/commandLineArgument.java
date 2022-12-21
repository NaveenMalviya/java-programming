public class commandLineArgument{
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int sum=a+b;
        System.out.println("Sum of two number using command line argument is: "+sum);
    }
}