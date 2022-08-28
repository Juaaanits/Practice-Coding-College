import java.util.Scanner;
public class Quiz
{
public static void main(String[] args)
{
int num;
Scanner sc = new Scanner(System.in);
System.out.print("Input Integer : ");
num = sc.nextInt();
sc.close(); // to avoid generating memory leak like resource leak
if ((num < 1) || (num > 3000))
{
System.out.println("");
System.out.println("Output : Invalid Output ");
}
else
{
int thousands = num / 1000;
int hundreds = (num % 1000) / 100;
int tens = (num % 100) / 10;
int ones = num % 10;
if (thousands == 1)
{
System.out.println("");
System.out.print("Output :" + " M");
}
else if (thousands == 2)
{
System.out.println("");
System.out.print("Output :" + " MM");
}
else if (thousands == 3)
{
System.out.println("");
System.out.print("Output :" + " MMM");
}
if (hundreds == 1)
{
System.out.print("C");
}
else if (hundreds == 2)
{
System.out.print("CC");
}
else if (hundreds == 3)
{
System.out.print("CCC");
}
else if (hundreds == 4)
{
System.out.print("CD");
}
else if (hundreds == 5)
{
System.out.print("D");
}
else if (hundreds == 6)
{
System.out.print("DC");
}
else if (hundreds == 7)
{
System.out.print("DCC");
}
else if (hundreds == 8)
{
System.out.print("DCCC");
}
else if (hundreds == 9)
{
System.out.print("CM");
}
if (tens == 1)
{
System.out.print("X");
}
else if (tens == 2)
{
System.out.print("XX");
}
else if (tens == 3)
{
System.out.print("XXX");
}
else if (tens == 4)
{
System.out.print("XL");
}
else if (tens == 5)
{
System.out.print("L");
}
else if (tens == 6)
{
System.out.print("LX");
}
else if (tens == 7)
{
System.out.print("LXX");
}
else if (tens == 8)
{
System.out.print("LXXX");
}
else if (tens == 9)
{
System.out.print("XC");
}
if (ones == 1)
{
System.out.print("I");
}
else if (ones == 2)
{
System.out.print("II");
}
else if (ones == 3)
{
System.out.print("III");
}
else if (ones == 4)
{
System.out.print("IV");
}
else if (ones == 5)
{
System.out.print("V");
}
else if (ones == 6)
{
System.out.print("VI");
}
else if (ones == 7)
{
System.out.print("VII");
}
else if (ones == 8)
{
System.out.print("VIII");
}
else if (ones == 9)
{
System.out.print("IX");
}
}
}
}