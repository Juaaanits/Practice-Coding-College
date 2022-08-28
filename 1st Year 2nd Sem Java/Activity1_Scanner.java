import java.util.Scanner;

class Activity1_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length, width, asqcm, asqin, asqft, asqm;
        double area, perimeter, pcm, pin, pft, pm;

        System.out.print("Enter Length of Rectangle in cm  :    ");
        length = scanner.nextDouble();

        System.out.print("Enter Width of Rectangle in cm   :    ");
        width = scanner.nextDouble();

        scanner.close(); // to avoid generating memory leak like resource leak

        area = length * width;
        perimeter = 2 * (length + width);
        asqcm = area;
        asqm = area * 0.0001;
        asqin = asqcm * 0.155;
        asqft = asqcm * 0.00107639;

        pcm = perimeter;
        pm = perimeter * 0.01;
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
        System.out.println("\t\t     Perimeter = " + pcm + " cm.");
        System.out.println("\t\t\t\t  " + pm + " m.");
        System.out.println("\t\t\t\t  " + pin + " in.");
        System.out.println("\t\t\t\t  " + pft + " ft.");

    }
}
