import java.util.*;

public class Conversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {

            System.out.println(
                    "Enter a choice for which you want to perform an operation:\n1. convert to binary.\n2. convert to Octal.\n3. convert to hexaDecimal.\n4. Exit");

            int choice = sc.nextInt();
            if (choice ==4) {
                System.out.println("Exit ");
                break;
            }
            if(choice>4){
                System.out.println("Enter a valid choice and try again.");
                break;
            }
            System.out.println("Enter a number you want to convert: ");

            int number = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Binary " + toBinary(number));

                    break;

                case 2:
                    System.out.println("Octal " + toOctal(number));

                    toOctal(number);

                    break;

                case 3:
                    System.out.println("HexaDecimal " + toHexaDecimal(number));

                    toHexaDecimal(number);

                    break;

            }
        }
        sc.close();
    }

    public static String toBinary(int number) {

        String binary = "";

        int rem = 0;

        while (number > 0) {

            rem = number % 2;

            binary = rem + binary;

            number = number / 2;

        }

        return binary;

    }

    public static String toHexaDecimal(int number) {
        String HexaDecimal = "";
        int rem = 0;
        while (number > 0) {
            rem = number % 16;
            switch (rem) {
                case 10:
                    HexaDecimal = "A" + HexaDecimal;
                    break;
                case 11:
                    HexaDecimal = "B" + HexaDecimal;
                    break;
                case 12:
                    HexaDecimal = "C" + HexaDecimal;
                    break;
                case 13:
                    HexaDecimal = "D" + HexaDecimal;
                    break;
                case 14:
                    HexaDecimal = "E" + HexaDecimal;
                    break;
                case 15:
                    HexaDecimal = "F" + HexaDecimal;
                    break;
                default:
                    HexaDecimal = rem + HexaDecimal;
            }
            number = number / 16;
        }
        return HexaDecimal;

    }

    public static String toOctal(int number) {
        String Octal = "";
        int rem = 0;
        while (number > 0) {
            rem = number % 8;
            Octal = rem + Octal;
            number = number / 8;
        }

        return Octal;

    }
}
