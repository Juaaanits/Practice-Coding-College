import java.util.Scanner;
public class Grading_system
{
public static void main(String[] args)
{
// This program inputs the grades in percentage and output its numerical
// equivalent and remark.
double grade;
Scanner scan = new Scanner(System.in);
System.out.print("Input Grade in Percentage (%) : ");
grade = scan.nextDouble();
scan.close(); // to avoid generating memory leak like resource leak
if ((grade >= 97) && (grade <= 100))
{
System.out.println("");
System.out.println("Equivalent Numerical Grade : 1.00 ");
System.out.println("Remarks : Excellent");
}
else if ((grade >= 94) && (grade <= 96))
{
System.out.println("");
System.out.println("Equivalent Numerical Grade : 1.25 ");
System.out.println("Remarks : Excellent");
}
else if ((grade >= 91) && (grade <= 93))
{
System.out.println("");
System.out.println("Equivalent Numerical Grade : 1.50 ");
System.out.println("Remarks : Very Good");
}
else if ((grade >= 88) && (grade <= 90))
{
System.out.println("");
System.out.println("Equivalent Numerical Grade : 1.75 ");
System.out.println("Remarks : Very Good");
}
else if ((grade >= 85) && (grade <= 87))
{
System.out.println("");
System.out.println("Equivalent Numerical Grade : 2.00 ");
System.out.println("Remarks : Good");
}
else if ((grade >= 83) && (grade <= 84))
{
System.out.println("");
System.out.println("Equivalent Numerical Grade : 2.25 ");
System.out.println("Remarks : Good");
}
else if ((grade >= 80) && (grade <= 82))
{
System.out.println("");
System.out.println("Equivalent Numerical Grade : 2.50 ");
System.out.println("Remarks : Fair");
}
else if ((grade >= 78) && (grade <= 79))
{
System.out.println("");
System.out.println("Equivalent Numerical Grade : 2.75 ");
System.out.println("Remarks : Fair");
}
else if ((grade >= 75) && (grade <= 77))
{
System.out.println("");
System.out.println("Equivalent Numerical Grade : 3.00 ");
System.out.println("Remarks : Passed");
}
else if ((grade >= 70) && (grade <= 74))
{
System.out.println("");
System.out.println("Equivalent Numerical Grade : 4.00 ");
System.out.println("Remarks : Conditional");
}
else if ((grade <= 70) && (grade >= 50))
{
System.out.println("");
System.out.println("Equivalent Numerical Grade : 5.00 ");
System.out.println("Remarks : Failed");
}
else
{
System.out.println("");
System.out.println("Invalid Input Grade");
}
}
}