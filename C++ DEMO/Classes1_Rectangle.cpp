//Create a C++ program that would ask the user to access the length and width of a rectangle.
//Display the area and perimeter. Use functions to handle user inputs, compute area, and compute perimeter.
//Use structures

#include <iostream>
using namespace std;

class GasPump //class declaration
{
private:
	double length, width; //member data
public:
	void askUser();       //member functions
	double getArea();
	double getPerimeter();
};


int main()
{
	Rectangle rect;
	
	rect.askUser();
	rect.getArea();
	rect.getPerimeter();

    return 0;
}

//function implementation

//function to hold the user input
void Rectangle::askUser()
{
    cout<<"Enter length: ";
    cin>>length;
    cout<<"Enter width: ";
    cin>>width;   
}
//function to get the area
double Rectangle::getArea()
{
    cout<<"Area = "<<length*width<<endl;
    return 0;
}
//function to get perimeter
double Rectangle::getPerimeter()
{
    cout<<"Perimeter = "<<(2*length)+(2*width)<<endl;
    return 0;
}


