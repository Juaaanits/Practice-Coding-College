//Write a program in C++ to print the sum of two numbers.
#include <iostream>

using namespace std;

class Addition
{
private:
	double firstNumber, secondNumber, sum;
public:
	void askUser();
	void addNumbers();
};

int main()
{
	Addition addition;
	
	addition.askUser();
	addition.addNumbers();
	
	
	return 0;
}


void Addition::askUser()
{
	cout << "Enter first number: " << endl;
	cin >> firstNumber;
	
	cout << "Enter second number: " << endl;
	cin >> secondNumber;
	
}

void Addition::addNumbers()
{
	cout << "Sum: " << firstNumber+secondNumber << endl;
}
