import java.util.Scanner;
public class Dec2Hexa
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

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a number on base 10(decimal): ");
        int decimal = scan.nextInt();

        System.out.println("The hexadecimal conversion of the given decimal is: " + toHex(decimal));
    }
}



