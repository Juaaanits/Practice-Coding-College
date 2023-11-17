import java.util.Scanner;
public class AddTwoNumbersReturn {

    public static void main(String[] arguments) {
        Scanner data = new Scanner(System.in);

        float num1=0, num2 = 0;

        System.out.println("USER INPUT: Add two numbers\n");

        System.out.print("Enter first number   : ");
        num1 = data.nextFloat();

        System.out.print("Enter second number  : ");
        num2= data.nextFloat();

        float total = classAdd(num1, num2);
        System.out.println("\nSum of 2 numbers is: " + total);

        data.close();
    }
    //create a class named classAdd and return a value
    public static float classAdd(float n1, float n2){
        float result = n1 + n2;
        return result;
    }
}
