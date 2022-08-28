import java.util.Scanner;
public class Activity4_2
{
public static void main(String[] args)
{
char alphabet;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a letter : ");
alphabet = scanner.next().charAt(0);
scanner.close();
switch (alphabet)
{
case 'A':
case 'a':
System.out.print(alphabet + " is a vowel");
break;
case 'B':
case 'b':
System.out.print(alphabet + " is a consonant");
break;
case 'C':
case 'c':
System.out.print(alphabet + " is a consonant");
break;
case 'D':
case 'd':
System.out.print(alphabet + " is a consonant");
break;
case 'E':
case 'e':
System.out.print(alphabet + " is a vowel");
break;
case 'F':
case 'f':
System.out.print(alphabet + " is a consonant");
break;
case 'G':
case 'g':
System.out.print(alphabet + " is a consonant");
break;
case 'H':
case 'h':
System.out.print(alphabet + " is a consonant");
break;
case 'I':
case 'i':
System.out.print(alphabet + " is a vowel");
break;
case 'J':
case 'j':
System.out.print(alphabet + " is a consonant");
break;
case 'K':
case 'k':
System.out.print(alphabet + " is a consonant");
break;
case 'L':
case 'l':
System.out.print(alphabet + " is a consonant");
break;
case 'M':
case 'm':
System.out.print(alphabet + " is a consonant");
break;
case 'N':
case 'n':
System.out.print(alphabet + " is a consonant");
break;
case 'O':
case 'o':
System.out.print(alphabet + " is a vowel");
break;
case 'P':
case 'p':
System.out.print(alphabet + " is a consonant");
break;
case 'Q':
case 'q':
System.out.print(alphabet + " is a consonant");
break;
case 'R':
case 'r':
System.out.print(alphabet + " is consonant");
break;
case 'S':
case 's':
System.out.print(alphabet + " is a consonant");
break;
case 'T':
case 't':
System.out.print(alphabet + " is a consonant");
break;
case 'U':
case 'u':
System.out.print(alphabet + " is a vowel");
break;
case 'V':
case 'v':
System.out.print(alphabet + " is a consonant");
break;
case 'W':
case 'w':
System.out.print(alphabet + " is a consonant");
break;
case 'X':
case 'x':
System.out.print(alphabet + " is a consonant");
break;
case 'Y':
case 'y':
System.out.print(alphabet + " is a consonant");
break;
case 'Z':
case 'z':
System.out.print(alphabet + " is a consonant");
break;
default:
System.out.print("Input is not an alphabet!");
return;
}
}
}
