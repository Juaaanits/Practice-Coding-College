import java.util.Scanner;
public class Number_2 {
public static void main(String[] args) {
Scanner YesNo = new Scanner(System.in);
String response;
do {
int num;
Scanner sc = new Scanner(System.in);
System.out.print("Enter integer (from 1 to 3000) : ");
num = sc.nextInt();
if ((num < 1) || (num > 3000)) {
System.out.println("");
System.out.println("Output : Invalid Output ");
} else {
int thousands = num / 1000;
int hundreds = (num % 1000) / 100;
int tens = (num % 100) / 10;
int ones = num % 10;
// Converting thousands digit
if (thousands == 1) {
System.out.print("Equivalent in words : One Thousand");
} else if (thousands == 2) {
System.out.print("Equivalent in words : Two Thousand");
} else if (thousands == 3) {
System.out.print("Equivalent in words : Three Thousand");
} else if (thousands == 4) {
System.out.print("Equivalent in words : Four Thousand");
} else if (thousands == 5) {
System.out.print("Equivalent in words : Five Thousand");
} else if (thousands == 6) {
System.out.print("Equivalent in words : Six Thousand");
} else if (thousands == 7) {
System.out.print("Equivalent in words : Seven Thousand");
} else if (thousands == 8) {
System.out.print("Equivalent in words : Eight Thousand");
} else if (thousands == 9) {
System.out.print("Equivalent in words : Nine Thousand");
}
// Converting hundreds digit
if (hundreds == 1) {
System.out.print(" One Hundred");
} else if (hundreds == 2) {
System.out.print(" Two Hundred");
} else if (hundreds == 3) {
System.out.print(" Three Hundred");
} else if (hundreds == 4) {
System.out.print(" Four Hundred");
} else if (hundreds == 5) {
System.out.print(" Five Hundred");
} else if (hundreds == 6) {
System.out.print(" Six Hundred");
} else if (hundreds == 7) {
System.out.print(" Seven Hundred");
} else if (hundreds == 8) {
System.out.print(" Eight Hundred");
} else if (hundreds == 9) {
System.out.print(" Nine Hundred");
}
// Converting tens digit
if ((tens == 1) && (ones == 0)) {
System.out.print(" Ten ");
} else if ((tens == 1) && (ones == 1)) {
System.out.print(" Eleven ");
} else if ((tens == 1) && (ones == 2)) {
System.out.print(" Twelve ");
} else if ((tens == 1) && (ones == 3)) {
System.out.print(" Thirteen ");
} else if ((tens == 1) && (ones == 4)) {
System.out.print(" Fourteen ");
} else if ((tens == 1) && (ones == 5)) {
System.out.print(" Fifteen ");
} else if ((tens == 1) && (ones == 6)) {
System.out.print(" Sixteen ");
} else if ((tens == 1) && (ones == 7)) {
System.out.print(" Seventeen ");
} else if ((tens == 1) && (ones == 8)) {
System.out.print(" Eighteen ");
} else if ((tens == 1) && (ones == 9)) {
System.out.print(" Nineteen ");
} else if ((tens == 2) && (ones == 0)) {
System.out.print(" Twenty ");
} else if ((tens == 2) && (ones == 1)) {
System.out.print(" Twenty One ");
} else if ((tens == 2) && (ones == 2)) {
System.out.print(" Twenty Two ");
} else if ((tens == 2) && (ones == 3)) {
System.out.print(" Twenty Three ");
}
else if ((tens == 2) && (ones == 4)) {
System.out.print(" Twenty Four ");
} else if ((tens == 2) && (ones == 5)) {
System.out.print(" Twenty Five ");
} else if ((tens == 2) && (ones == 6)) {
System.out.print(" Twenty Six ");
} else if ((tens == 2) && (ones == 7)) {
System.out.print(" Twenty Seven ");
} else if ((tens == 2) && (ones == 8)) {
System.out.print(" Twenty Eight ");
} else if ((tens == 2) && (ones == 9)) {
System.out.print(" Twenty Nine ");
} else if ((tens == 3) && (ones == 0)) {
System.out.print(" Thirty ");
} else if ((tens == 3) && (ones == 1)) {
System.out.print(" Thirty One ");
} else if ((tens == 3) && (ones == 2)) {
System.out.print(" Thirty Two ");
} else if ((tens == 3) && (ones == 3)) {
System.out.print(" Thirty Three ");
} else if ((tens == 3) && (ones == 4)) {
System.out.print(" Thirty Four ");
} else if ((tens == 3) && (ones == 5)) {
System.out.print(" Thirty Five ");
} else if ((tens == 3) && (ones == 6))
{
System.out.print(" Thirty Six ");
} else if ((tens == 3) && (ones == 7)) {
System.out.print(" Thirty Seven ");
} else if ((tens == 3) && (ones == 8)) {
System.out.print(" Thirty Eight ");
} else if ((tens == 3) && (ones == 9)) {
System.out.print(" Thirty Nine ");
} else if ((tens == 4) && (ones == 0)) {
    System.out.print(" Forty ");
    } else if ((tens == 4) && (ones == 1)) {
    System.out.print(" Forty One ");
    } else if ((tens == 4) && (ones == 2)) {
    System.out.print(" Forty Two ");
    } else if ((tens == 4) && (ones == 3)) {
    System.out.print(" Forty Three ");
    } else if ((tens == 4) && (ones == 4)) {
    System.out.print(" Forty Four ");
    } else if ((tens == 4) && (ones == 5)) {
    System.out.print(" Forty Five ");
    } else if ((tens == 4) && (ones == 6)) {
    System.out.print(" Forty Six ");
    } else if ((tens == 4) && (ones == 7)) {
    System.out.print(" Forty Seven ");
    } else if ((tens == 4) && (ones == 8)) {
    System.out.print(" Forty Eight ");
    } else if ((tens == 4) && (ones == 9)) {
    System.out.print(" Forty Nine ");
    } else if ((tens == 5) && (ones == 0)) {
    System.out.print(" Fifty ");
    } else if ((tens == 5) && (ones == 1)) {
    System.out.print(" Fifty One ");
    } else if ((tens == 5) && (ones == 2)) {
    System.out.print(" Fifty Two ");
    } else if ((tens == 5) && (ones == 3)) {
    System.out.print(" Fifty Three ");
    } else if ((tens == 5) && (ones == 4)) {
    System.out.print(" Fifty Four ");
    } else if ((tens == 5) && (ones == 5)) {
    System.out.print(" Fifty Five ");
    } else if ((tens == 5) && (ones == 6)) {
    System.out.print(" Fifty Six ");
    } else if ((tens == 5) && (ones == 7)) {
    System.out.print(" Fifty Seven ");
    } else if ((tens == 5) && (ones == 8)) {
    System.out.print(" Fifty Eight ");
    } else if ((tens == 5) && (ones == 9)) {
    System.out.print(" Fifty Nine ");
    } else if ((tens == 6) && (ones == 0)) {
    System.out.print(" Sixty ");
    } else if ((tens == 6) && (ones == 1))
    {
    System.out.print(" Sixty One ");
    } else if ((tens == 6) && (ones == 2)) {
    System.out.print(" Sixty Two ");
    } else if ((tens == 6) && (ones == 3)) {
    System.out.print(" Sixty Three ");
    } else if ((tens == 6) && (ones == 4)) {
    System.out.print(" Sixty Four ");
    } else if ((tens == 6) && (ones == 5)) {
    System.out.print(" Sixty Five ");
    } else if ((tens == 6) && (ones == 6)) {
    System.out.print(" Sixty Six ");
    } else if ((tens == 6) && (ones == 7)) {
    System.out.print(" Sixty Seven ");
    } else if ((tens == 6) && (ones == 8)) {
    System.out.print(" Sixty Eight ");
    } else if ((tens == 6) && (ones == 9)) {
    System.out.print(" Sixty Nine ");
    } else if ((tens == 7) && (ones == 0)) {
    System.out.print(" Seventy ");
    } else if ((tens == 7) && (ones == 1)) {
    System.out.print(" Seventy One ");
    } else if ((tens == 7) && (ones == 2)) {
    System.out.print(" Seventy Two ");
    } else if ((tens == 7) && (ones == 3)) {
    System.out.print(" Seventy Three ");
    } else if ((tens == 7) && (ones == 4)) {
    System.out.print(" Seventy Four ");
    } else if ((tens == 7) && (ones == 5)) {
    System.out.print(" Seventy Five ");
    } else if ((tens == 7) && (ones == 6)) {
    System.out.print(" Seventy Six ");
    } else if ((tens == 7) && (ones == 7)) {
    System.out.print(" Seventy Seven ");
    } else if ((tens == 7) && (ones == 8)) {
    System.out.print(" Seventy Eight ");
    } else if ((tens == 7) && (ones == 9)) {
    System.out.print(" Seventy Nine ");
    } else if ((tens == 8) && (ones == 0)) {
    System.out.print(" Eighty ");
    } else if ((tens == 8) && (ones == 1)) {
    System.out.print(" Eighty One ");
    } else if ((tens == 8) && (ones == 2)) {
    System.out.print(" Eighty Two ");
    } else if ((tens == 8) && (ones == 3)) {
    System.out.print(" Eighty Three ");
    } else if ((tens == 8) && (ones == 4)) {
    System.out.print(" EightY Four ");
    } else if ((tens == 8) && (ones == 5)) {
    System.out.print(" Eighty Five ");
    } else if ((tens == 8) && (ones == 6)) {
    System.out.print(" Eighty Six ");
    } else if ((tens == 8) && (ones == 7)) {
    System.out.print(" Eighty Seven ");
    } else if ((tens == 8) && (ones == 8)) {
    System.out.print(" Eighty Eight ");
    } else if ((tens == 8) && (ones == 9)) {
    System.out.print(" Eighty Nine ");
    } else if ((tens == 9) && (ones == 0)) {
    System.out.print(" Ninety ");
    } else if ((tens == 9) && (ones == 1)) {
    System.out.print(" Ninety One ");
    } else if ((tens == 9) && (ones == 2)) {
    System.out.print(" Ninety Two ");
    } else if ((tens == 9) && (ones == 3)) {
    System.out.print(" Ninety Three ");
    } else if ((tens == 9) && (ones == 4)) {
    System.out.print(" Ninety Four ");
    } else if ((tens == 9) && (ones == 5)) {
    System.out.print(" Ninety Five ");
    } else if ((tens == 9) && (ones == 6)) {
    System.out.print(" Ninety Six ");
    } else if ((tens == 9) && (ones == 7)) {
    System.out.print(" Ninety Seven ");
    }
    else if ((tens == 9) && (ones == 8)) {
    System.out.print(" Ninety Eight ");
    } else if ((tens == 9) && (ones == 9)) {
    System.out.print(" Ninety Nine ");
    }
    // Converting ones digit
    else if ((tens != 1) && (ones == 1)) {
    System.out.print(" One ");
    } else if (ones == 2) {
    System.out.print(" Two ");
    } else if ((tens != 1) && (ones == 3)) {
    System.out.print(" Three ");
    } else if ((tens != 1) && (ones == 4)) {
    System.out.print(" Four ");
    } else if ((tens != 1) && (ones == 5)) {
    System.out.print(" five ");
    } else if ((tens != 1) && (ones == 6)) {
    System.out.print(" Six ");
    } else if ((tens != 1) && (ones == 7)) {
    System.out.print(" Seven ");
    } else if ((tens != 1) && (ones == 8)) {
    System.out.print(" Eight ");
    } else if ((tens != 1) && (ones == 9)) {
    System.out.print(" Nine ");
    }
    System.out.print("\n");
    if (thousands == 1) {
    System.out.println("");
    System.out.print("Equivalent in Roman numeral :" + " M");
    } else if (thousands == 2) {
    System.out.println("");
    System.out.print("Equivalent in Roman numeral :" + " MM");
    } else if (thousands == 3) {
    System.out.println("");
    System.out.print("Equivalent in Roman numeral :" + " MMM");
    }
    if (hundreds == 1) {
    System.out.print("C");
    } else if (hundreds == 2) {
    System.out.print("CC");
    } else if (hundreds == 3) {
    System.out.print("CCC");
    } else if (hundreds == 4) {
    System.out.print("CD");
    } else if (hundreds == 5) {
    System.out.print("D");
    } else if (hundreds == 6) {
    System.out.print("DC");
    } else if (hundreds == 7) {
    System.out.print("DCC");
    } else if (hundreds == 8) {
    System.out.print("DCCC");
    } else if (hundreds == 9) {
    System.out.print("CM");
    }
    if (tens == 1) {
    System.out.print("X");
    } else if (tens == 2) {
    System.out.print("XX");
    } else if (tens == 3) {
    System.out.print("XXX");
    } else if (tens == 4) {
    System.out.print("XL");
    } else if (tens == 5) {
    System.out.print("L");
} else if (tens == 6) {
    System.out.print("LX");
    } else if (tens == 7) {
    System.out.print("LXX");
    } else if (tens == 8) {
    System.out.print("LXXX");
    }
    else if (tens == 9) {
    System.out.print("XC");
    }
    if (ones == 1) {
    System.out.print("I");
    } else if (ones == 2) {
    System.out.print("II");
    } else if (ones == 3) {
    System.out.print("III");
    } else if (ones == 4) {
    System.out.print("IV");
    } else if (ones == 5) {
    System.out.print("V");
    } else if (ones == 6) {
    System.out.print("VI");
    } else if (ones == 7) {
    System.out.print("VII");
    } else if (ones == 8) {
    System.out.print("VIII");
    } else if (ones == 9) {
    System.out.print("IX");
    }
    }
    System.out.print("\n");
    System.out.print("Input another grade? [Y/N]: ");
    response = YesNo.next();
    } while (response.equals("Y"));
    }
    }