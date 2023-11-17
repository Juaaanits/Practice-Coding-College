#include<iostream>
#include<conio.h>
using namespace std;

class GasPump
[
	private:
		double liter, pricePerLiter, price;
	public:
		GasPump();
		void quantityDispensed();
		void resetLiter();
		void resetPrice();
		void distributeGasoline();
		void stopPump();			
];
int main()
[
	GasPump gaspump;
	
	gaspump.quantityDispensed();
	gaspump.resetLiter
	gaspump.resetPrice();
	gaspump.distributeGasoline();
	gaspump.stopPump();	
	
	return 0;
]
GasPump::GasPump()
{
	liter = 0.00;
	pricePerLiter = 62.0;
	price = 0.00;
}
void GasPump::quantityDispensed()
{
	liter+=0.01;
}
void GasPump::resetLiter()
{
	cout<<"Liter:               "<<liter<<endl;
}
void GasPump::resetPrice()
{
	price = liter * pricePerLiter;
	cout << "Price:            " << price << endl;
}
void GasPump::distributeGasoline()
{
	
}
void GasPump::stopPump()
{
	
}	
