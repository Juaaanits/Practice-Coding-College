import javax.swing.JOptionPane;
public class Activity2_JOptionPane
{
public static void main(String[] args)
{
String response;
response = JOptionPane.showInputDialog("This program converts input time in Seconds to its equivalent in Hours, Minutes, and Seconds \n\n" + " Input time in seconds: ");
int seconds = Integer.parseInt(response);
int hours = seconds / 3600;
int hr2 = seconds % 3600;
int minutes = hr2 / 60;
int s = hr2 % 60;
String msg = " The input time in seconds is equivalent to: " + hours + " Hours " + minutes + " Minutes " + s + " Seconds ";
JOptionPane.showMessageDialog(null, msg);
}
}