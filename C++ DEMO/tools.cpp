#include <iostream>
#include<conio.h>
#include<windows.h>
using namespace std;

class GasPump //class declaration
{
private:
	double price, liter, priceLiter; //member data
public:
	//void quantityDispensed();       //member functions
	//void amountCharged();
	//void costLiter();
	//void resetPump();	
	//void distributeGasoline();
	//void stop();
	//double initialization();
	GasPump(double = 0, double = 0, double = 62);
	void showPriceLiter();
	void showLiter();
	void showPrice();
	//void resetPump();
	void fillKey();
	void resetPump();
};


int main()
{
	int number = 0;
	GasPump gaspump;
	while(number == 0)
	{
	gaspump.showLiter();
	gaspump.showPriceLiter();
	gaspump.showPrice();
	//gaspump.resetPump();
	gaspump.fillKey();
	gaspump.resetPump();
	}
	//return 0;
 	
}
	
//function implementation
GasPump::GasPump(double pr, double lt, double pL)
{
	price = pr;
	liter = lt;
	priceLiter = pL;
	
	
};
void GasPump::showLiter()
{
	liter += 0.01;
   cout<<"Liter:            " <<liter<<endl;
}
void GasPump::showPrice()
{
	price = liter * priceLiter;
	cout<<"Price:            " << price<<endl;
}
void GasPump::showPriceLiter()
{
	priceLiter = 62.00;
	cout<<"Price per Liter: PhP" << priceLiter<<endl;
}
void GasPump::fillKey()
{
	cout<<endl;
	int input;
	cout<<"press X-RESET"<<endl;
	cout<<"enter key - Fill"<<endl;
	input = getch();
	if(input == 13)
	{
	system("pause");
	system("cls");
}
	
}
void GasPump::resetPump()
{
	liter = 0;
}

