import java.util.Scanner;
public class Dec2Bin
{
    public static void main(String[] args)
    {
            Scanner scan = new Scanner(System.in);

            //Asking the user input
            System.out.print("Input a number on base 10(decimal): ");
            int input = scan.nextInt();

            //Converting the decimal input into a binary number
            String binary = Integer.toBinaryString(input);
            System.out.print("The binary conversion of the input is: " + binary);
    }
}



