import java.util.Scanner;
public class AddTwoNumbers {

    //Calculate two values using a method
    public static void main(String[] arguments) {
        Scanner data = new Scanner(System.in);

        float num1=0, num2 = 0;

        System.out.println("USER INPUT: Add two numbers\n");

        System.out.print("Enter first number   : ");
        num1 = data.nextFloat();

        System.out.print("Enter second number  : ");
        num2= data.nextFloat();

        classAdd(num1, num2);
        data.close();
    }
    //create a class named classAdd
    public static void classAdd(float num1, float num2){
        float result = num1 + num2;
        System.out.println("\nSum of 2 numbers is: " + result);
    }

}
