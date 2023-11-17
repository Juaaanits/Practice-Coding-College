//Write a program in C++ to print the sum of two numbers.
/*#include <iostream>

using namespace std;

class Addition
{
private:
	double firstNumber, secondNumber, sum;
public:
	Addition();
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

Addition::Addition()
{
	firstNumber = 4;
	secondNumber = 4;
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
*/

#include <iostream>

using namespace std;

class DollarToPeso
{
private:
	double peso, dollar;
public:
	DollarToPeso();
	void askUser();
	void convert();
};

int main()
{
	DollarToPeso dollartopeso;
	
	dollartopeso.askUser();
	dollartopeso.convert();	
}

DollarToPeso::DollarToPeso()
{
	peso = 0;
	dollar = 0;
}

void DollarToPeso::askUser()
{
	cout<<"Input money in peso: "<<endl;
	cin>>peso;
}
void DollarToPeso::convert()
{
	dollar = peso * 59.00;
	cout <<"The amount of your money in terms of dollar is: " << dollar<<endl;
}
