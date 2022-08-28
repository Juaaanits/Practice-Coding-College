import javax.swing.JOptionPane; 
public class Activity1_JOptionPane
{
public static void main(String[] args)
{
String x = JOptionPane.showInputDialog("Enter Length of Rectangle: "); String y = JOptionPane.showInputDialog("Enter Width of Rectangle: ");
double a = Double.parseDouble(x); double b = Double.parseDouble(y);
double area = a * b;
double perimeter = 2 * (a + b); double asqcm = area;
double asqm = area / 10000; double asqin = asqcm * 0.155; double asqft = asqcm * 0.00107639;
double pcm = perimeter; double pm = perimeter / 100; double pin = pcm * 0.393701; double pft = pcm * 0.0328084;
String msg = "Area = " + asqcm + " sq. cm. \n " + " " + asqm + " sq. m. \n" +
" " + asqin + " sq. in. \n" +
" " + asqft + " sq. ft. \n" + " \n" +
"Perimeter = " + pcm + " cm. \n" +
" " + pm + " m. \n" +
" " + pin + " in. \n" +
" " + pft + " ft. \n";
JOptionPane.showMessageDialog(null, msg);
}
}