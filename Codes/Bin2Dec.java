import java.util.Scanner;

public class Bin2Dec
{
    public static void main(String args[])
    {
        System.out.println("Binary to Decimal Converter \n");

        //Asking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = sc.nextLine();

        //Binary number to decimal conversion
        int decimal = Integer.parseInt(binaryNumber, 2);
        System.out.print("The decimal conversion on the given binary number is: " + decimal);
    }
}
