import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Activity2_BufferedReader
{
public static void main(String args[]) throws Exception
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int seconds, hours, hr2, minutes, s;
System.out.println("This program converts input time in Seconds to its equivalent in Hours, Minutes, and Seconds");
System.out.println(" ");
System.out.print(" Input time in seconds : ");
seconds = Integer.parseInt(br.readLine());
hours = seconds / 3600;
hr2 = seconds % 3600;
minutes = hr2 / 60;
s = hr2 % 60;
System.out.println(" ");
System.out.println(" The input time in seconds is equivalent to: " + hours + " Hours " + minutes + " Minutes "+ s + " Seconds ");
}
}