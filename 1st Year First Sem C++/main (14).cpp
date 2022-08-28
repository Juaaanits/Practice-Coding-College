#include <iostream>
using namespace std;
void calculate(int&h, double& m);
void display(int h, double m);
int main ()
{
    int hours;
    double minutes;
    cout << "This program converts military hour(s) "<< endl;
    cout << " \n";
    cout << "Input time in 24 hours military standard hours:" << endl;
    cin >> hours;
    cout << "Input time in 24 hours military standard minutes." << endl;
    cin >> minutes;
    calculate(hours, minutes);
    display(hours,minutes);
    
    return 0;
}
    void calculate(int& h, double& m)
    {
        if(h<=12)
        {
            h = h - 0;
            m = m - 0;
        }
        if(h >= 13 && h <= 24)
        {
            h = h % 12;
            m = m - 0;
        }
        
    }    
     void display(int h, double m)
    {
     if (h<=12)
     {
        cout << "The time in 12 hour format is " << h << ":" << m << "AM" <<endl;
     }
     if (h >= 13 && h <=24)
     {
       cout << "The time in 12 hour format is " << h << ":" << m << "PM" <<endl; 
     }
        
        
    }





