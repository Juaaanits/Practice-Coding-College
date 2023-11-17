import java.util.Scanner;

public class Bin2Hex
{
    public static String toHex(int decimal)
    {
        int hexadecimal;
        String hex = "";
        char hexaCharacters[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(decimal>0)
        {
            hexadecimal = decimal%16;
            hex = hexaCharacters[hexadecimal] + hex;
            decimal=decimal/16;
        }
        return hex;
    }

    public static void main(String args[])
    {
        System.out.println("Binary to Hexadecimal Converter \n");

        //Asking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = sc.nextLine();

        //Binary to hexadecimal conversion
        int decimal = Integer.parseInt(binaryNumber, 2);
        System.out.println("The hexadecimal conversion of the given binary number is: " + toHex(decimal));

    }
}
