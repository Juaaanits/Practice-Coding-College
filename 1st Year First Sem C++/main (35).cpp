#include <iostream>
#include <conio.h>
#include <math.h>
using namespace std;
int main()
{
    char f ;
    double pi = 3.1416, r, c, a, d;
     cout << "What do you want to calculate: \n ";
    cin>>f;
    
    cout << "Enter value of r: \n";
    cin >> r;
    
    switch(f){
    
    case 'C':
    c = 2 * pi * r;
    cout <<"The circumference of a circle is: \n" << c ;
    break;
    case 'c':
    c = 2 * pi * r;
    cout <<"The circumference of a circle is: \n" << c;
    break;
    case 'A':
    a = pi * (r * r);
    cout <<"The area of a circle is: \n" << a;
    break;
    case 'a':
    a = pi * (r * r);
    cout <<"The area of a circle is: \n" << a;
    break;
    case 'D':
    d = 2 * r;
    cout <<"The diameter of a circle is: \n" << d;
    break;
    case 'd':
    d = 2 * r;
    cout <<"The diameter of a circle is: \n" << d;
    break;
    
    }
    getch();
    return 0;
    }





