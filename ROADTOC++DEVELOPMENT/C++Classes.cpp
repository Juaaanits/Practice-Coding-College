//C++ classes
//C++ calculator

#include<iostream>
using namespace std;

//class declaration-class definition
class Calculator
{
private:
	int num1, num2;   					//member data
public:
	Calculator();
	void askUser();					   //member functions
	int getSum();
	int getDifference();
	int getProduct();
	int getQuotient();
	int getRemainder();
};

int main()
{
	Calculator calc;
	
	//calc.askUser();
	calc.getSum();
	calc.getDifference();
	calc.getProduct();
	calc.getQuotient();
	calc.getRemainder();
	
	/*calc.askUser(calc.n1, calc.n2);
	calc.getSum(calc.n1, calc.n2);
	calc.getDifference(calc.n1, calc.n2);
	calc.getProduct(calc.n1, calc.n2);
	calc.getQuotient(calc.n1, calc.n2);
	calc.getRemainder(calc.n1, calc.n2);
	*/
	
	return 0;
}

//function implementation
Calculator::Calculator()
{
	num1=5;
	num2=5;
	cout<<"This is a default constructor"<<endl;
}
void Calculator::askUser()
{
	cout<<"Enter first number: "<<endl;
	cin>>num1;
	cout<<"Enter second number: "<<endl;
	cin>>num2;
	
}

int Calculator::getSum()
{
	cout <<"Sum: "<<num1+num2<<endl;
	
	return 0;
}

int Calculator::getDifference()
{
	cout <<"Difference: "<<num1-num2<<endl;
	
	return 0;
}
int Calculator::getProduct()
{
	cout <<"Product: "<<num1*num2<<endl;
	
	return 0;
}
int Calculator::getQuotient()
{
	cout <<"Quotient: "<<num1/num2<<endl;
	
	return 0;
}
int Calculator::getRemainder()
{
	cout <<"Remainder: "<<num1%num2<<endl;
	
	return 0;
}



