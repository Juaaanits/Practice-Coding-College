#include <iostream>
using namespace std;

int main( )
{


    double gallons;
    double liters;
    double quarts; 
    
    cout << "Input value in gallons\t\t\t\t\t : ";
    cin >> gallons; 

    liters = 3.7854 * gallons; 
    quarts = 4 * gallons;
    
    cout << "The converted value in liters is\t\t\t : " << liters << endl ;
    cout << "The converted value in quarts is\t\t\t : " << quarts << endl;
    
 return 0;
}
   






