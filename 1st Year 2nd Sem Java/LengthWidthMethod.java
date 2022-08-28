import java.util.Scanner;
//Method:
class LengthWidthMethod
{
public void LengthWidth()
{
double length, width;
double area, perimeter, asqcm, asqm, asqin, asqft, pcm, pm, pin, pft;
Scanner scan = new Scanner(System.in);
System.out.print("Enter Length of Rectangle in cm : ");
length = scan.nextDouble();
System.out.print("Enter Width of Rectangle in cm : ");
width = scan.nextDouble();
area = length * width;
perimeter = 2 * (length + width);
asqcm = area;
asqm = area / 10000;
asqin = asqcm * 0.155;
asqft = asqcm * 0.00107639;
pcm = perimeter;
pm = perimeter / 100;
pin = pcm * 0.393701;
pft = pcm * 0.0328084;
System.out.println("");
System.out.println("");
System.out.println("\t\t\t Area = " + asqcm + " sq. cm.");
System.out.println("\t\t\t\t" + asqm + " sq. m.");
System.out.println("\t\t\t\t" + asqin + " sq. in.");
System.out.println("\t\t\t\t" + asqft + " sq. ft.");
System.out.println("");
System.out.println("");
System.out.println("\t\t Perimeter = " + pcm + " cm.");
System.out.println("\t\t\t\t " + pm + " m.");
System.out.println("\t\t\t\t " + pin + " in.");
System.out.println("\t\t\t\t " + pft + " ft.");
}
}