import java.util.Scanner;

public class BinarySubtraction
{
    public static void main(String args[])
    {
        System.out.println("Binary Subtraction \n");

        //Asking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String first_binaryNumber = sc.nextLine();

        System.out.print("Enter a binary number: ");
        String second_binaryNumber = sc.nextLine();

        //Converting the binary number inputs first into decimal
        int first_decimal = Integer.parseInt(first_binaryNumber, 2);
        int second_decimal = Integer.parseInt(second_binaryNumber, 2);

        //Getting the sum of the decimal conversions
        int difference = first_decimal - second_decimal;

        if (difference<0) {
            int final_difference = Math.abs(difference);


            //Converting the decimal difference into binary
            String binary = Integer.toBinaryString(final_difference);

            System.out.print("The difference of the two binary numbers is: -" + binary);
        }

        else
        {
            String binary = Integer.toBinaryString(difference);

            System.out.print("The difference of the two binary numbers is: " + binary);
        }
    }

}


