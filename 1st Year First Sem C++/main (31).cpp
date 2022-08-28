#include <iostream>
#include <math.h>
using namespace std;

int main()
{
    int x;
    
    cout << "\tsine, cosine and tangent values of numbers from 1-10";
    cout << "\n";
    
    cout << "Number \t\t Sine \t\t Cosine \t\t Tangent \t\t ";
    for  (x = 1; x <= 10; x++){
        cout << "\n" << x;
        cout << "\t";
        cout << sin(x);
        cout << "\t";
        cout << cos(x);
        cout << "\t";
        cout << tan(x);
        
    }
    cout << "\n\n";
    cout << "\tEnd of Program";
    
    
    
    
   
    return 0;
}


   
   





























