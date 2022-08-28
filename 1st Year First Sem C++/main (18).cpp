#include <iostream>
#include <cmath>
using namespace std; 
int main()
{
    double s, a, b, c, d;
    double A = sqrt ((s - a) * (s - b) * (s -c) * (s - d));
    cout << "Enter the value of a : ";
    cin >> a;
    cout << "Enter the value of b : ";
    cin >> b;
    cout << "Enter the value of c : ";
    cin >> c;
    cout << "Enter the value of d : ";
    cin >> d;
    
    s = (a + b + c + d) / 2;
    A =  sqrt ((s - a) * (s - b) * (s -c) * (s - d));
    
    cout << "\n";
    cout << "Area of a cyclic quadrilateral : " << A <<endl;
    
    return 0;
}



