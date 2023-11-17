//Create a C++ program that would ask the user to access the length and width of a rectangle.
//Display the area and perimeter. Use functions to handle user inputs, compute area, and compute perimeter.
//Use structures

#include <iostream>
using namespace std;

struct Rectangle
{
	double length, width;    //number variables
	
};

//define the function
//function prototypes

void askUser(double&, double&);
double getArea(double, double);
double getPerimeter(double, double);

int main()
{
	//variable declaration
	Rectangle rect;
	
    askUser(rect.length, rect.width);
    getArea(rect.length, rect.width);
    getPerimeter(rect.length, rect.width);

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


