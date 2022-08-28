#include <iostream>
using namespace std;

int main()
{
   double length, width, area, perimeter;
   
   cout << "This program computes for the area of a rectangle and perimeter \n"; 
   cout << " \n";
   cout << "Enter length: ";
   cin >> length;
   cout << " \n";
   cout << "Enter width: ";
   cin >> width;
   cout << "\n";
   area = length * width;
   perimeter = (length + width) * 2;
   
   cout << "Area: " << area << endl; 
   cout << " \n";
   cout << "Perimeter: " << perimeter;
   

    return 0;
}


