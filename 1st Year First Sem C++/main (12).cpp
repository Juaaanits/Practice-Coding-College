#include <iostream>
using namespace std;

int main()
{
   double F, Celsius, temperature;
   
   cout << "Input temperature in Farenheit : ";
   cin >> F;
   
   Celsius = (5 * (F - 32))/9;
   cout << "The converted temperature in Celsius is : " << Celsius  << endl; 
   
   

    return 0;
}



