import java.util.Scanner;
public class fahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit: ");
        int temperature=sc.nextInt();
        int celsius=((temperature-32)*5)/9;
        System.out.println("Temperature in Celsius is:"+celsius);
        sc.close();
        
}
}
