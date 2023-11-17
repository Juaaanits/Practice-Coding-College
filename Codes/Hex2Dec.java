import java.util.Scanner;

public class Hex2Dec
{
    public static void main(String args[])
    {
        System.out.println("Hexadecimal to Decimal Converter \n");

        //Asking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexadecimal = sc.nextLine();

        //Hexadecimal to decimal conversion
        int decimal=Integer.parseInt(hexadecimal,16);
        System.out.print("The decimal conversion on the given hexadecimal is: " + decimal);
    }
}
