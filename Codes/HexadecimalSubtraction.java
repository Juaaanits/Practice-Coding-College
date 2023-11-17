import java.util.Scanner;

public class HexadecimalSubtraction {

    public static String toHex(int difference) {

        int hexadecimal;
        String hex = "";
        char hexaCharacters[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (difference > 0) {
            hexadecimal = difference % 16;
            hex = hexaCharacters[hexadecimal] + hex;
            difference = difference / 16;
        }
        return hex;
    }


    public static void main(String args[]) {
        System.out.println("Hexadecimal Subtraction\n");

        //Asking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String first_hexadecimal = sc.nextLine();
        System.out.print("Enter a hexadecimal number: ");
        String second_hexadecimal = sc.nextLine();

        int first_decimal = Integer.parseInt(first_hexadecimal, 16);
        int second_decimal = Integer.parseInt(second_hexadecimal, 16);

        int difference = first_decimal - second_decimal;

        if (second_decimal > first_decimal)
        {
            int final_difference = Math.abs(difference);
            System.out.print("The difference of the two hexadecimal numbers is: -" + toHex(final_difference));
        }
        else
        {
            System.out.print("The difference of the two hexadecimal numbers is: " + toHex(difference));

        }

    }
}