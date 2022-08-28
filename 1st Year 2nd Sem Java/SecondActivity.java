import java.util.Scanner;
//Method:
class Time
{
public static void TimeConversion()
{
int seconds, hours, hr2, minutes, s;
Scanner scan = new Scanner(System.in);
System.out.println("This program converts input time in Seconds to its equivalent in Hours, Minutes, and Seconds");
System.out.println(" ");
System.out.print("\tInput time in seconds : ");
seconds = scan.nextInt();
scan.close(); // So that the program won't be unexecutable
hours = seconds / 3600;
hr2 = seconds % 3600;
minutes = hr2 / 60;
s = hr2 % 60;
System.out.println(" ");
System.out.println("\tThe input time in seconds is equivalent to: " + hours + " Hours " +minutes + " Minutes " + s + " Seconds ");
}
}
//MethodTest
public class SecondActivity
{
public static void main(String[] args)
{
Time mySecondActivity = new Time();
//Calling Method TimeConversion()
mySecondActivity.TimeConversion();
}
}
