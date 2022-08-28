#include <iostream>
using namespace std;

int main( )
{

    double hp, W, KW, f, j;
    
    cout << "Input value in Horse Power \t\t\t\t\t  : ";
    cin >> hp; 

    W = 745.7 * hp;
    KW = 0.7457 * hp;
    f = 550 * hp;
    j = 745.6998715823 * hp;
    
    
    cout << "The converted value in Watt(W)\t\t\t\t\t : " << W << endl ;
    cout << "The converted value in Kilo Watt(KW) \t\t\t\t\t : " << KW << endl;
    cout << "The converted value in Feet-pounds per second(ft-lbs/s) \t\t\t\t\t " << f << endl;         
    cout << "The converted value in Joules per second: (j/s)\t\t\t\t\t: " << j << endl; 


 return 0;
}
   


