#include <iostream>
using namespace std;

int main()
{
   double radius, surfacearea, volume, pi = 3.1416;
   
   cout << "Input radius in centimeter: ";
   cin >> radius;
   
   
   surfacearea = 4 * pi * (radius * radius); 
   volume = (4 * pi * radius * radius * radius)/3;
   
   cout << "The surface area of a sphere in square centimeter is: " << surfacearea << endl; 
   cout << "The volume of a sphere in cubic centimeter is: " <<  volume;
   
    return 0;
}







