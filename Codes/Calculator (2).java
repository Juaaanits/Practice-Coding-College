/*import java.util.Scanner;
import java.io.IOException;

public class Calculator {

    public static void main(String args[])
    {
        Compute();
    }

    public static void Compute()
    {
        String response;
        try{

            do
            {
                Scanner scan = new Scanner(System.in);

                System.out.print("NUMBER SYSTEM \n");
                System.out.println("1. BINARY");
                System.out.print("2. DECIMAL\n");
                System.out.print("3. HEXADECIMAL\n");
                System.out.print("\nENTER YOUR CHOICE: ");

                int number_system = scan.nextInt();
                if ((number_system < 1) && (number_system > 3) && (number_system >= 'A') && (number_system <='Z'))
                {
                    cls();
                    Compute();
                }

                else
                {
                    System.out.println("");

                    if (number_system == 1)
                    {
                        System.out.print("ENTER FIRST BINARY NUMBER: ");
                        String firstBinaryNum = scan.next();

                        int firstBinNum= Integer.parseInt(firstBinaryNum);

                        if (firstBinNum == 0 || firstBinNum == 1
                            || firstBinNum < 0)
                        {
						    //System.out.println("Invalid Input");
                            cls();
                            Compute();
                    }

                    while (firstBinNum != 0)
                    {
                        if (firstBinNum % 10 > 1)
                        {
                            //System.out.println("Invalid Input");;
                            cls();
                            Compute();
                        }
                        firstBinNum = firstBinNum / 10;
                    }
                    System.out.print("ENTER SECOND BINARY NUMBER: ");
                    String secondBinaryNum = scan.next();
                    int secondBinNum= Integer.parseInt(secondBinaryNum);

					      if (secondBinNum == 0 || secondBinNum == 1 || secondBinNum < 0)
                          {
					            cls();
					            Compute();
                           }
                                while (secondBinNum != 0) {
                                    if (secondBinNum % 10 > 1)
                                    {
                                        cls();
                                        Compute();
                                    }
                                    secondBinNum = secondBinNum / 10;
					                System.out.println("");

                    System.out.print("ARITHMETIC OPERATION \n");
                    System.out.print("1. ADDITION \n");
                    System.out.print("2. SUBTRACTION \n");
                    System.out.print("3. MULTIPLICATION \n");
                    System.out.print("4. DIVISION\n");
                    System.out.print("ENTER YOUR CHOICE: ");
                    int arithmetic_operation = scan.nextInt();
                    if ((arithmetic_operation < 1) && (arithmetic_operation > 4) && (arithmetic_operation >= 'A') && (arithmetic_operation <='Z' ))
                    {
                        cls();
                        //Compute();
                    }

                    else {
                        if (arithmetic_operation == 1) {
                            int first_decimal = Integer.parseInt(firstBinaryNum, 2);
                            int second_decimal = Integer.parseInt(secondBinaryNum, 2);

                            int sum = first_decimal + second_decimal;

                            String binary = Integer.toBinaryString(sum);
                            System.out.println("");
                            System.out.print("Result: " + binary);
                        }

                        if (arithmetic_operation == 2) {
                            int first_decimal = Integer.parseInt(firstBinaryNum, 2);
                            int second_decimal = Integer.parseInt(secondBinaryNum, 2);

                            int difference = first_decimal - second_decimal;

                            if (difference < 0) {
                                int final_difference = Math.abs(difference);

                                String binary = Integer.toBinaryString(final_difference);
                                System.out.println("");
                                System.out.print("Result: -" + binary);
                            } else {
                                String binary = Integer.toBinaryString(difference);
                                System.out.println("");
                                System.out.print("Result: " + binary);
                            }
                        }

                        if (arithmetic_operation == 3) {
                            int first_decimal = Integer.parseInt(firstBinaryNum, 2);
                            int second_decimal = Integer.parseInt(secondBinaryNum, 2);

                            int product = first_decimal * second_decimal;

                            String binary = Integer.toBinaryString(product);
                            System.out.println("");
                            System.out.print("Result: " + binary);
                        }

                        if (arithmetic_operation == 4) {
                            int first_decimal = Integer.parseInt(firstBinaryNum, 2);
                            int second_decimal = Integer.parseInt(secondBinaryNum, 2);

                            int quotient = first_decimal / second_decimal;

                            String binary = Integer.toBinaryString(quotient);

                            int remainder = first_decimal % second_decimal;

                            String binRemainder = Integer.toBinaryString(remainder);
                            System.out.println("");
                            System.out.print("Result: " + binary + " r." + binRemainder);
                        }
                    }
                }

                    }


                else if (number_system == 2) {
                    System.out.print("ENTER FIRST DECIMAL NUMBER: ");
                    int firstDecimalNum = scan.nextInt();
                    String dataType= ((Object)firstDecimalNum).getClass().getSimpleName();

                    if (dataType.equals("Integer"))
                    {
                        System.out.print("ENTER SECOND DECIMAL NUMBER: ");
                        int secondDecimalNum = scan.nextInt();
                        dataType = ((Object)secondDecimalNum).getClass().getSimpleName();

                        if(dataType.equals("Integer"))
                        {
                        System.out.println("");
                        System.out.print("ARITHMETIC OPERATION \n");
                        System.out.print("1. ADDITION \n");
                        System.out.print("2. SUBTRACTION \n");
                        System.out.print("3. MULTIPLICATION \n");
                        System.out.print("4. DIVISION\n");
                        System.out.print("ENTER YOUR CHOICE: ");
                        int arithmetic_operation = scan.nextInt();
                            if ((arithmetic_operation < 1) && (arithmetic_operation > 4) && (arithmetic_operation >= 'A') && (arithmetic_operation <='Z' ))
                            {
                                cls();
                                Compute();
                            }


                            if (arithmetic_operation == 1)
                            {
                            int sum = firstDecimalNum + secondDecimalNum;
                            System.out.println("");
                            System.out.print("Result: " + sum);
                            }

                            if (arithmetic_operation == 2) {

                            int difference = firstDecimalNum - secondDecimalNum;

                                if (difference < 0)
                                {
                                int final_difference = Math.abs(difference);

                                System.out.println("");
                                System.out.print("Result: -" + final_difference);
                                }
                                else
                                {
                                System.out.println("");
                                System.out.print("Result: " + difference);
                                }
                            }

                            if (arithmetic_operation == 3)
                            {
                            int product = firstDecimalNum * secondDecimalNum;
                            System.out.println("");
                            System.out.print("Result: " + product);
                            }

                            if (arithmetic_operation == 4)
                            {
                            int quotient = firstDecimalNum / secondDecimalNum;

                            int remainder = firstDecimalNum % secondDecimalNum;
                            System.out.println("");
                            System.out.print("Result: " + quotient + " r." + remainder);
                            }
                        }
                        else
                        {
                            cls();
                            Compute();

                        }
                    }


                    else
                    {
                        cls();
                        Compute();
                    }

                }

                else if (number_system == 3)
                {
                    System.out.print("ENTER FIRST HEXADECIMAL NUMBER: ");
                    String firstHexadecimalNum = scan.next();
                    // Size of string
                    int n = firstHexadecimalNum.length();

                    // Iterate over string
                    for (int i = 0; i < n; i++)
                    {

                        char ch = firstHexadecimalNum.charAt(i);

                        // Check if the character
                        // is invalid
                        if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F'))
                        {
                            cls();
                            Compute();
                        }
                    }
                    System.out.print("ENTER SECOND HEXADECIMAL NUMBER: ");
                    String secondHexadecimalNum = scan.next();

                    // Size of string
                    int k = secondHexadecimalNum.length();

                    // Iterate over string
                    for (int i = 0; i < k; i++)
                    {

                        char ch = secondHexadecimalNum.charAt(i);

                        // Check if the character
                        // is invalid
                        if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F'))
                        {
                            cls();
                            Compute();
                        }
                    }
                    System.out.println("");

                    System.out.print("ARITHMETIC OPERATION \n");
                    System.out.print("1. ADDITION \n");
                    System.out.print("2. SUBTRACTION \n");
                    System.out.print("3. MULTIPLICATION \n");
                    System.out.print("4. DIVISION\n");
                    System.out.print("ENTER YOUR CHOICE: ");
                    int arithmetic_operation = scan.nextInt();
                    if ((arithmetic_operation < 1) && (arithmetic_operation > 4) && (arithmetic_operation >= 'A') && (arithmetic_operation <='Z' ))
                    {
                            cls();
                            Compute();
                    }


                    if (arithmetic_operation == 1)
                    {
                        int first_decimal = Integer.parseInt(firstHexadecimalNum, 16);
                        int second_decimal = Integer.parseInt(secondHexadecimalNum, 16);

                        int sum = first_decimal + second_decimal;

                        String hexadecimal = Integer.toHexString(sum);
                        System.out.println("");
                        System.out.print("Result: " + hexadecimal.toUpperCase());
                    }

                    if (arithmetic_operation == 2)
                    {
                        int first_decimal = Integer.parseInt(firstHexadecimalNum, 16);
                        int second_decimal = Integer.parseInt(secondHexadecimalNum, 16);

                        int difference = first_decimal - second_decimal;

                        if (difference < 0)
                        {
                            int final_difference = Math.abs(difference);

                            String hexadecimal = Integer.toHexString(final_difference);
                            System.out.println("");
                            System.out.print("Result: -" + hexadecimal.toUpperCase());
                        }
                        else
                        {
                            String hexadecimal = Integer.toHexString(difference);
                            System.out.println("");
                            System.out.print("Result: " + hexadecimal.toUpperCase());
                        }
                    }

                    if (arithmetic_operation == 3)
                    {
                        int first_decimal = Integer.parseInt(firstHexadecimalNum, 16);
                        int second_decimal = Integer.parseInt(secondHexadecimalNum, 16);

                        int product = first_decimal * second_decimal;

                        String hexadecimal = Integer.toHexString(product);
                        System.out.println("");
                        System.out.print("Result: " + hexadecimal.toUpperCase());
                    }

                    if (arithmetic_operation == 4)
                    {
                        int first_decimal = Integer.parseInt(firstHexadecimalNum, 16);
                        int second_decimal = Integer.parseInt(secondHexadecimalNum, 16);

                        int quotient = first_decimal / second_decimal;

                        String hexadecimal = Integer.toHexString(quotient);

                        int remainder = first_decimal % second_decimal;

                        String hexRemainder = Integer.toHexString(remainder);
                        System.out.println("");
                        System.out.print("Result: " + hexadecimal.toUpperCase() + " r." + hexRemainder.toUpperCase());
                    }
                }
            }

                System.out.print("");
                System.out.print("\nDo you want to calculate more: ?");
                response = scan.next();
				cls();
                if(response.equalsIgnoreCase("N"))
                {
                    System.exit(0);
                }


            }

            while(response.equalsIgnoreCase("Y"));
        }
        catch(Exception e)
        {
            cls();
            Compute();
        }
    }
    public static void cls()
    {
        try
        {
            new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();
        }
        catch(Exception f)
        {
            System.out.print(f);
        }
    }

}

*/
import java.util.Scanner;
import java.io.IOException;

public class Calculator {

    public static void main(String args[])
    {
        Compute();
    }

    public static void Compute()
    {
        String response;
        try{

            do
            {
                Scanner scan = new Scanner(System.in);

                System.out.print("NUMBER SYSTEM \n");
                System.out.println("1. BINARY");
                System.out.print("2. DECIMAL\n");
                System.out.print("3. HEXADECIMAL\n");
                System.out.print("\nENTER YOUR CHOICE: ");

                int number_system = scan.nextInt();
                if ((number_system >= 1) && (number_system <= 3))
                {
                    System.out.println("");

                    if (number_system == 1) {
                        System.out.print("ENTER FIRST BINARY NUMBER: ");
                        String firstBinaryNum = scan.next();

                        int r = 0, c = 0;
                        int m = 0, n = 0;
                        int firstBinNum = Integer.parseInt(firstBinaryNum);
                        while (firstBinNum > 0) {
                            if ((firstBinNum % 10 == 0) || (firstBinNum % 10 == 1))
                                c++;
                            r++;
                            firstBinNum = firstBinNum / 10;

                        }
                        if (c == r) {
                            System.out.print("ENTER SECOND BINARY NUMBER: ");
                            String secondBinaryNum = scan.next();
                            int secondBinNum = Integer.parseInt(secondBinaryNum);
                            while (secondBinNum > 0)
                            {
                                if ((secondBinNum % 10 == 0) || (secondBinNum % 10 == 1))
                                    m++;
                                n++;
                                secondBinNum = secondBinNum / 10;

                            }
                            if (m == n)
                            {
                                System.out.print("ARITHMETIC OPERATION \n");
                                System.out.print("1. ADDITION \n");
                                System.out.print("2. SUBTRACTION \n");
                                System.out.print("3. MULTIPLICATION \n");
                                System.out.print("4. DIVISION\n");
                                System.out.print("ENTER YOUR CHOICE: ");
                                int arithmetic_operation = scan.nextInt();
                                if ((arithmetic_operation >= 1) && (arithmetic_operation <= 4))
                                {
                                    if (arithmetic_operation == 1) {
                                        int first_decimal = Integer.parseInt(firstBinaryNum, 2);
                                        int second_decimal = Integer.parseInt(secondBinaryNum, 2);

                                        int sum = first_decimal + second_decimal;

                                        String binary = Integer.toBinaryString(sum);
                                        System.out.println("");
                                        System.out.print("Result: " + binary);
                                    }

                                    if (arithmetic_operation == 2) {
                                        int first_decimal = Integer.parseInt(firstBinaryNum, 2);
                                        int second_decimal = Integer.parseInt(secondBinaryNum, 2);

                                        int difference = first_decimal - second_decimal;

                                        if (difference < 0) {
                                            int final_difference = Math.abs(difference);

                                            String binary = Integer.toBinaryString(final_difference);
                                            System.out.println("");
                                            System.out.print("Result: -" + binary);
                                        } else {
                                            String binary = Integer.toBinaryString(difference);
                                            System.out.println("");
                                            System.out.print("Result: " + binary);
                                        }
                                    }

                                    if (arithmetic_operation == 3) {
                                        int first_decimal = Integer.parseInt(firstBinaryNum, 2);
                                        int second_decimal = Integer.parseInt(secondBinaryNum, 2);

                                        int product = first_decimal * second_decimal;

                                        String binary = Integer.toBinaryString(product);
                                        System.out.println("");
                                        System.out.print("Result: " + binary);
                                    }

                                    if (arithmetic_operation == 4) {
                                        int first_decimal = Integer.parseInt(firstBinaryNum, 2);
                                        int second_decimal = Integer.parseInt(secondBinaryNum, 2);

                                        int quotient = first_decimal / second_decimal;

                                        String binary = Integer.toBinaryString(quotient);

                                        int remainder = first_decimal % second_decimal;

                                        String binRemainder = Integer.toBinaryString(remainder);
                                        System.out.println("");
                                        System.out.print("Result: " + binary + " r." + binRemainder);
                                    }

                                }
                                else {
                                    cls();
                                    Compute();
                                }

                            }
                            else {
                                cls();
                                Compute();
                            }

                        }
                        else {
                            cls();
                            Compute();
                        }
                    }

                    else if (number_system == 2) {
                        System.out.print("ENTER FIRST DECIMAL NUMBER: ");
                        int firstDecimalNum = scan.nextInt();
                        String dataType= ((Object)firstDecimalNum).getClass().getSimpleName();

                        if (dataType.equals("Integer"))
                        {
                            System.out.print("ENTER SECOND DECIMAL NUMBER: ");
                            int secondDecimalNum = scan.nextInt();
                            dataType = ((Object)secondDecimalNum).getClass().getSimpleName();

                            if(dataType.equals("Integer"))
                            {
                                System.out.println("");
                                System.out.print("ARITHMETIC OPERATION \n");
                                System.out.print("1. ADDITION \n");
                                System.out.print("2. SUBTRACTION \n");
                                System.out.print("3. MULTIPLICATION \n");
                                System.out.print("4. DIVISION\n");
                                System.out.print("ENTER YOUR CHOICE: ");
                                int arithmetic_operation = scan.nextInt();
                                if ((arithmetic_operation >= 1) && (arithmetic_operation <= 4))
                                {
                                    if (arithmetic_operation == 1)
                                    {
                                        int sum = firstDecimalNum + secondDecimalNum;
                                        System.out.println("");
                                        System.out.print("Result: " + sum);
                                    }

                                    if (arithmetic_operation == 2) {

                                        int difference = firstDecimalNum - secondDecimalNum;

                                        if (difference < 0)
                                        {
                                            int final_difference = Math.abs(difference);

                                            System.out.println("");
                                            System.out.print("Result: -" + final_difference);
                                        }
                                        else
                                        {
                                            System.out.println("");
                                            System.out.print("Result: " + difference);
                                        }
                                    }

                                    if (arithmetic_operation == 3)
                                    {
                                        int product = firstDecimalNum * secondDecimalNum;
                                        System.out.println("");
                                        System.out.print("Result: " + product);
                                    }

                                    if (arithmetic_operation == 4)
                                    {
                                        int quotient = firstDecimalNum / secondDecimalNum;

                                        int remainder = firstDecimalNum % secondDecimalNum;
                                        System.out.println("");
                                        System.out.print("Result: " + quotient + " r." + remainder);
                                    }
                                }
                                else
                                {
                                    cls();
                                    Compute();
                                }

                            }
                            else
                            {
                                cls();
                                Compute();

                            }
                        }

                        else
                        {
                            cls();
                            Compute();
                        }

                    }

                    else if (number_system == 3)
                    {
                        System.out.print("ENTER FIRST HEXADECIMAL NUMBER: ");
                        String firstHexadecimalNum = scan.next();
                        // Size of string
                        int n = firstHexadecimalNum.length();

                        // Iterate over string
                        for (int i = 0; i < n; i++)
                        {

                            char ch = firstHexadecimalNum.charAt(i);

                            // Check if the character
                            // is invalid
                            if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F'))
                            {
                                cls();
                                Compute();
                            }
                        }
                        System.out.print("ENTER SECOND HEXADECIMAL NUMBER: ");
                        String secondHexadecimalNum = scan.next();

                        // Size of string
                        int k = secondHexadecimalNum.length();

                        // Iterate over string
                        for (int i = 0; i < k; i++)
                        {

                            char ch = secondHexadecimalNum.charAt(i);

                            // Check if the character
                            // is invalid
                            if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F'))
                            {
                                cls();
                                Compute();
                            }
                        }
                        System.out.println("");

                        System.out.print("ARITHMETIC OPERATION \n");
                        System.out.print("1. ADDITION \n");
                        System.out.print("2. SUBTRACTION \n");
                        System.out.print("3. MULTIPLICATION \n");
                        System.out.print("4. DIVISION\n");
                        System.out.print("ENTER YOUR CHOICE: ");
                        int arithmetic_operation = scan.nextInt();
                        if ((arithmetic_operation >= 1) && (arithmetic_operation <= 4))
                        {
                            if (arithmetic_operation == 1)
                            {
                                int first_decimal = Integer.parseInt(firstHexadecimalNum, 16);
                                int second_decimal = Integer.parseInt(secondHexadecimalNum, 16);

                                int sum = first_decimal + second_decimal;

                                String hexadecimal = Integer.toHexString(sum);
                                System.out.println("");
                                System.out.print("Result: " + hexadecimal.toUpperCase());
                            }

                            if (arithmetic_operation == 2)
                            {
                                int first_decimal = Integer.parseInt(firstHexadecimalNum, 16);
                                int second_decimal = Integer.parseInt(secondHexadecimalNum, 16);

                                int difference = first_decimal - second_decimal;

                                if (difference < 0)
                                {
                                    int final_difference = Math.abs(difference);

                                    String hexadecimal = Integer.toHexString(final_difference);
                                    System.out.println("");
                                    System.out.print("Result: -" + hexadecimal.toUpperCase());
                                }
                                else
                                {
                                    String hexadecimal = Integer.toHexString(difference);
                                    System.out.println("");
                                    System.out.print("Result: " + hexadecimal.toUpperCase());
                                }
                            }

                            if (arithmetic_operation == 3)
                            {
                                int first_decimal = Integer.parseInt(firstHexadecimalNum, 16);
                                int second_decimal = Integer.parseInt(secondHexadecimalNum, 16);

                                int product = first_decimal * second_decimal;

                                String hexadecimal = Integer.toHexString(product);
                                System.out.println("");
                                System.out.print("Result: " + hexadecimal.toUpperCase());
                            }

                            if (arithmetic_operation == 4)
                            {
                                int first_decimal = Integer.parseInt(firstHexadecimalNum, 16);
                                int second_decimal = Integer.parseInt(secondHexadecimalNum, 16);

                                int quotient = first_decimal / second_decimal;

                                String hexadecimal = Integer.toHexString(quotient);

                                int remainder = first_decimal % second_decimal;

                                String hexRemainder = Integer.toHexString(remainder);
                                System.out.println("");
                                System.out.print("Result: " + hexadecimal.toUpperCase() + " r." + hexRemainder.toUpperCase());
                            }
                        }
                        else
                        {
                            cls();
                            Compute();
                        }

                    }

                }
                else
                {
                    cls();
                    Compute();
                }




                System.out.print("");
                System.out.print("\nDo you want to calculate more: ?");
                response = scan.next();
                cls();
                if(response.equalsIgnoreCase("N"))
                {
                    System.exit(0);
                }


            }

            while(response.equalsIgnoreCase("Y"));
        }
        catch(Exception e)
        {
            cls();
            Compute();
        }
    }
    public static void cls()
    {
        try
        {
            new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();
        }
        catch(Exception f)
        {
            System.out.print(f);
        }
    }

}


