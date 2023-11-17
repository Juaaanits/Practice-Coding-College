import java.util.Scanner;

public class HexadecimalAddition {

    public static String toHex(int sum) {

        int hexadecimal;
        String hex = "";
        char hexaCharacters[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (sum > 0) {
            hexadecimal = sum % 16;
            hex = hexaCharacters[hexadecimal] + hex;
            sum = sum / 16;
        }
        return hex;
    }


    public static void main(String args[]) {
        System.out.println("Hexadecimal Addition\n");

        //Asking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String first_hexadecimal = sc.nextLine();
        System.out.print("Enter a hexadecimal number: ");
        String second_hexadecimal = sc.nextLine();

        //Converting the hexadecimal inputs first into decimal numbers
        int first_decimal = Integer.parseInt(first_hexadecimal, 16);
        int second_decimal = Integer.parseInt(second_hexadecimal, 16);

        //Getting the sum of decimal conversions
        int sum = first_decimal + second_decimal;

        //Converting decimal sum to hexadecimal
        System.out.println("The total of the given hexadecimal number is: " + toHex(sum));
    }
}