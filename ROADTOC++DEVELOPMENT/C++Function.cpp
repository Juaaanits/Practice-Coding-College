//C++ Function
//C++ calculator

#include<iostream>
using namespace std;

//function prototypes
void askUser(int& ,int&);
int getSum(int, int);
int getDifference(int, int);
int getProduct(int, int);
int getQuotient(int, int);
int getRemainder(int, int);


int main()
{
	int n1, n2;
	
	askUser(n1, n2);
	getSum(n1, n2);
	getDifference(n1, n2);
	getProduct(n1, n2);
	getQuotient(n1, n2);
	getRemainder(n1, n2);
	
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


































/*
class Calculator 
[
	private: 
		num1, num2
	public: 
		void askNum1();
		void askNum2();
		void addNumbers();
]

int main()
{
	Calculator calculator;
	
	calculator.askNum1();
	calculator.askNum2();
	calculator.addNumbers();
	
	return 0;
};
void askNum1()
{ 
	cout << "Enter first number: "<<endl;
	cin >> num1;
}
void askNum2()
{
	cout << "Enter second number: "<<endl;
	cin >> num2
}
void addNumbers()
{
	cout<<num1+num2;
}
*/
