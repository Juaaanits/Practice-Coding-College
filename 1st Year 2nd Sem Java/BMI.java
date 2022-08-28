import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input your height in meters(m)    :");
        double height = scan.nextDouble();

        System.out.print("Input your weight in kilograms(kg):    ");
        double weight = scan.nextDouble();

        double range = weight / height * height;

        if (range < 18.5) {
            System.out.print("Your computed BMI is                          :      " + range);
            System.out.print("The classification of your BMI is             :       underweight");
        }

        else if (18.5 <= range && range <= 24.9) {
            System.out.print("Your computed BMI is                          :        " + range);
            System.out.print("The classification of your BMI is             :         normal");
        } else if (25.0 <= range && range <= 29.9) {
            System.out.print("Your computed BMI is                          :       " + range);
            System.out.print("The classification of your BMI is                        :         overweight");
        } else if (range >= 30) {
            System.out.print("Your computed BMI is                          :       " + range);
            System.out.print("The classification of your BMI is                        :         obese");
        } else {
            System.out.print("You entered a wrong input");
        }

    }

}