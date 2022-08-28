import java.util.Scanner;
public class IntegerToRoman {

    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input Integer : ");
        num = sc.nextInt();
        sc.close(); // to avoid generating memory leak like resource leak

        if ((num < 1) || (num > 3000)) {
            System.out.println("");
            System.out.println("Output:  Invalid Output ");
        } 
        else {

            String[] ones = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
            String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
            String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
            String[] thousands = { "", "M", "MM", "MMM" };

            System.out.println("");
            System.out.println("Output: " + thousands[num / 1000] + hundreds[(num % 1000) / 100]
                    + tens[(num % 100) / 10] + ones[num % 10]);
        }

    }
}
