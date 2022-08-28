import java.util.Scanner;

public class scanner{
    
    public static void main(String[] args){
        
        
    Scanner scanner = new Scanner(System.in);
    
    double length, width, asqcm, asqin, asqft, asqm;
   double area, perimeter, pcm, pin, pft, pm;  
    
    System.out.print("Enter the length of rectangle:"  );
    length = scanner.nextDouble();
    
    System.out.print("Enter the width  of rectangle: ");
    width = scanner.nextDouble();
    
    area = length * width;
    perimeter = 2 * (length + width);
    asqcm = area;
   asqin = asqcm / 6.4516 ;
   asqft = asqin / 144;
   asqm = asqft / 10.7584;
   pcm = perimeter;
   pin = pcm / 2.54;
   pft = pin / 12;
   pm = pft / 3.28;
    
   System.out.println("Area= ");
   System.out.println(asqcm+ " sq. cm.");
   System.out.println(asqm+ " sq. m.");
   System.out.println(asqin+ " sq. in.");
   System.out.println(asqft+ " sq. ft.");
   System.out.println("");
   System.out.println("Perimeter= ");
   System.out.println(pcm+ " cm.");
   System.out.println(pm+" m.");
   System.out.println(pin+" in.");
   System.out.println(pft+"ft");
   
   
    }
}