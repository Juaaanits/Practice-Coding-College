#include <iostream>
using namespace std;

int main()
{
   double radius, circumference, diameter, pi = 3.1416;
   
   
   cout << "Input radius                            : ";
   cin >> radius;
   
   
   circumference =  2 * pi * radius; 
   diameter = 2 * radius;
   
   cout << "The circumference of a circle is        : " << circumference << endl; 
   cout << "The diameter of a circle is             : " << diameter;
   

    return 0;
}





