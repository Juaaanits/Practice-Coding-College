#include <iostream>
#include <iomanip>

/*

Sum, Difference, Product, and Quotient in C++

Enter 1st number:
Enter 2nd number:

Sum:
Difference:
Product:
Quotient:  */

 
int main() 
{
   double a = 0.00, b = 0.00;
   double sum = 0.00, difference = 0.00;
   double product = 0.00, quotient = 0.00;
   
   std::cout <<"\n\n";
   std::cout << "\tSum, Difference, Product, and Quotient of two floating-point numbers";
   std::cout <<"\n\n";
   std::cout <<"\tEnter 1st Number : ";
   std::cin >> a;
   std::cout <<"\tEnter 2nd number : ";
   std::cin >> b;
   std::cout <<"\n";
   
   sum = (a + b) ;
   difference = (a - b);
   product = (a * b);
   quotient = (a / b);
   
   std::cout << std::fixed << std::showpoint;
   std::cout << std::setprecision(2);
   std::cout <<"\n";
   std::cout <<"\tSum           :    " << sum << "\n";
   std::cout <<"\tDifference    :    " << difference << "\n";
   std::cout <<"\tProduct       :    " << product << "\n";
   std::cout <<"\tQuotient      :    "<< quotient << "\n";
   std::cout <<"\n";
   std::cout <<"\tEnd of Program";
   std::cout <<"\n";

    return 0;
}

