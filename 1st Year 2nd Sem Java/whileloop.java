//Method
class Days
{
public static void MondayToSunday ()
{
String days[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
"Sunday" };
int i = 0;
while (i < days.length)
{
System.out.println(days[i]);
i++;
}
}
}
//Method Test
public class whileloop
{
public static void main(String[] args)
{
Days myOutputs = new Days();
//Calling Method MondayToSunday()
myOutputs.MondayToSunday();
}
}
