#include<iostream>
using namespace std;

class Circle //class declaration
{
private:
	double radius, circumference, diameter, pi = 3.1416;
public:
	void askUser();
	double getCircumference();
	double getDiameter();
	
};

int main()
{
	Circle circ;
	
	circ.askUser();
	circ.getCircumference();
	circ.getDiameter();
	
	return 0;
}

//function implementation

void Circle::askUser()
{
	cout << "Input radius                            : ";
	cin>>radius;
}

double Circle::getCircumference()
{
	cout << "The circumference of the circle is      : " <<  2 * pi * radius << endl; 
	return 0;
}

double Circle::getDiameter()
{
	cout << "The diameter of the circle is           : " << 2 * radius << endl; 
	return 0;
}
