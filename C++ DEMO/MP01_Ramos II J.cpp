//Create a definition for the class GasPump which will be used to mimic a gas pump in a car service station

#include <iostream>
#include<conio.h>
using namespace std;

//class declaration
class GasPump     
{
//member data
private:
	double price, liter, priceLiter;          
public:
	GasPump(double = 0.00, double = 0.00, double = 62.00);
	void Increment();
	void showPriceLiter();
	void showLiter();
	void showPrice();
	void fillKey();
	void resetPump();
};

void loop(int number = 0, int inputs = 0);

int main()
{
	loop();
	GasPump();

	return 0;
}

void loop(int number, int inputs)
{
	GasPump gaspump;
	while (number == 0)
	{
		gaspump.showLiter();
		gaspump.showPriceLiter();
		gaspump.showPrice();
		gaspump.fillKey();

		char input = _getch();
		inputs = input;


		if (inputs == 13)
		{
			gaspump.Increment();
			system("cls");
		}

		else if (inputs == 88)
		{
			gaspump.resetPump();
			system("cls");
		}
		
		else if (inputs == 120)
		{
			gaspump.resetPump();
			system("cls");
		}
			
	}

}

//function implementation
GasPump::GasPump(double pr, double lt, double pL)
{
	price = pr;
	liter = lt;
	priceLiter = pL;
};
void GasPump::Increment()
{
	liter += 0.01;
}
void GasPump::showLiter()
{
	cout << "Liter:            " << liter << endl;
}
void GasPump::showPrice()
{
	price = liter * priceLiter;
	cout << "Price:            " << price << endl;
}
void GasPump::showPriceLiter()
{
	priceLiter = 62.00;
	cout << "Price per Liter: PhP" << priceLiter << endl;
}
void GasPump::fillKey()
{
	cout << endl;
	cout << "press X-RESET" << endl;
	cout << "enter key - Fill" << endl;
}
void GasPump::resetPump()
{
    liter = 0.00;
}


