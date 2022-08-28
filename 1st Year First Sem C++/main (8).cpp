#include <iostream>
using namespace std;

int main()

{
   double length, width, asqcm, asqin, asqft, asqm;
   double area, perimeter, pcm, pin, pft, pm;  
   
   cout << "Input length of a square in centimeter: ";
   cin >> length;
   cout << "Input width of a square in centimeter: ";
   cin >> width;
   
   area = length * width;
   perimeter = 2 * length + 2 * width ;
   asqcm = area;
   asqin = asqcm / 6.4516 ;
   asqft = asqin / 144;
   asqm = asqft / 10.7584;
   pcm = perimeter;
   pin = pcm / 2.54;
   pft = pin / 12;
   pm = pft / 3.28;
   
   cout << "\n ";
   cout << "Area of a square:\t\t\t\t\t\t\t" << area << " sq. cm.\n";  
   cout << "\t\t\t\t\t\t\t\t      "<< asqin <<" sq. in.   \n";
   cout << "\t\t\t\t\t\t\t\t      "<< asqft<< " sq. ft.  \n";
   cout << "\t\t\t\t\t\t\t          "<< asqm << " sq. m. \n";
   cout << " \n";
   cout << "Perimeter of a square:\t\t\t\t\t\t\t " << perimeter <<" cm.  \n ";
   cout << "\t\t\t\t\t\t\t\t    "                     << pin << " in. \n";
   cout <<  "\t\t\t\t\t\t\t\t     "<< pft << " ft.  \n";
   cout <<  "\t\t\t\t\t\t\t\t   " << pm << " m.  \n";
   
   

    return 0;
}





