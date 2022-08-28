import java.util.Scanner;
public class Counter
{
public static void main(String[] args)
{
int num;
Scanner scan = new Scanner(System.in);
System.out.print("Enter an Integer Number : ");
num = scan.nextInt();
scan.close(); // to avoid generating memory leak like resource leak
if ((num >= 0) && (num <= 9))
{
System.out.println("");
System.out.println("You entered a one digit number. ");
System.out.println("The number is " + num);
}
else if ((num >= 10) && (num <= 99))
{
System.out.println("");
System.out.println("You entered a two digit number. ");
System.out.println("The number is " + num);
}
else if ((num >= 100) && (num <= 999))
{
System.out.println("");
System.out.println("You entered a three digit number. ");
System.out.println("The number is " + num);
}
else if ((num >= 1000) && (num <= 9999))
{
System.out.println("");
System.out.println("You entered a four digit number. ");
System.out.println("The number is " + num);
}
else
{
System.out.println("");
System.out.println("Invalid Input ");
}
}
}