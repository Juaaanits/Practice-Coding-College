import java.util.Scanner;

public class BinaryAddition
{
    public static void main(String args[])
    {
        System.out.println("Binary Addition \n");

        //Asking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String first_binaryNumber = sc.nextLine();

        System.out.print("Enter a binary number: ");
        String second_binaryNumber = sc.nextLine();

        //Converting the binary numbers first into decimal
        int first_decimal = Integer.parseInt(first_binaryNumber, 2);
        int second_decimal = Integer.parseInt(second_binaryNumber, 2);

        //Adding their decimal conversions
        int sum = first_decimal + second_decimal;

        //Converting the sum from decimal to binary
        String binary = Integer.toBinaryString(sum);

        System.out.print("The sum of the two binary numbers is: " +binary);
    }
}





