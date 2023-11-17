//C++ Structure
//C++ calculator

#include<iostream>
using namespace std;

//class declaration
struct Calculator
{
	int n1, n2;   //member variables
};

void askUser(int& ,int&);
int getSum(int, int);
int getDifference(int, int);
int getProduct(int, int);
int getQuotient(int, int);
int getRemainder(int, int);

int main()
{
	Calculator calc;
	
	askUser(calc.n1, calc.n2);
	getSum(calc.n1, calc.n2);
	getDifference(calc.n1, calc.n2);
	getProduct(calc.n1, calc.n2);
	getQuotient(calc.n1, calc.n2);
	getRemainder(calc.n1, calc.n2);
	
	return 0;
}

//function implementation

void askUser(int& num1, int& num2)
{
	cout<<"Enter first number: "<<endl;
	cin>>num1;
	cout<<"Enter second number: "<<endl;
	cin>>num2;
	
}

int getSum(int num1, int num2)
{
	cout <<"Sum: "<<num1+num2<<endl;
	
	return 0;
}

int getDifference(int num1, int num2)
{
	cout <<"Difference: "<<num1-num2<<endl;
	
	return 0;
}
int getProduct(int num1, int num2)
{
	cout <<"Product: "<<num1*num2<<endl;
	
	return 0;
}
int getQuotient(int num1, int num2)
{
	cout <<"Quotient: "<<num1/num2<<endl;
	
	return 0;
}
int getRemainder(int num1, int num2)
{
	cout <<"Remainder: "<<num1%num2<<endl;
	
	return 0;
}






















