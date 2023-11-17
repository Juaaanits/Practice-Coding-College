#include <iostream>
using namespace std;

//define the function
// function prototypes

void askUser(double&, double&);
double getArea(double, double);
double getPerimeter(double, double);

int main()
{
    double length, width;

    askUser(length, width);
    getArea(length, width);
    getPerimeter(length, width);

    return 0;
}

//function implementation

//function to hold the user input
void askUser(double& l, double& w)
{
    cout<<"Enter length: ";
    cin>>l;
    cout<<"Enter width: ";
    cin>>w;   
}
//function to get the area
double getArea(double l, double w)
{
    cout<<"Area = "<<l*w<<endl;
    return 0;
}
//function to get perimeter
double getPerimeter(double l, double w)
{
    cout<<"Perimeter = "<<(2*l)+(2*w)<<endl;
    return 0;
}


