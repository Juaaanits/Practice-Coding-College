import java.util.Scanner;
public class Activity4_1
{
public static void main(String[] args)
{
double first_num, second_num;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter first number : ");
first_num = scanner.nextDouble();
System.out.print("Enter second number : ");
second_num = scanner.nextDouble();
System.out.print("Enter an operator (+, -, *, /) : ");
char operator = scanner.next().charAt(0);
scanner.close();
double output;
switch (operator)
{
case '+':
output = first_num + second_num;
break;
case '-':
output = first_num - second_num;
break;
case '*':
output = first_num * second_num;
break;
case '/':
output = first_num / second_num;
break;
default:
System.out.printf("You have entered wrong operator!");
return;
}
System.out.println(first_num + " " + operator + " " + second_num + " " + "= " + output);
}
}