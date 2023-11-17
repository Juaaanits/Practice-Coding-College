#include <iostream>
using namespace std;

int main()
{
    int bin[1000], decimal, i;
    
    cout << "Input a decimal number: ";
    cin >> decimal;
    
    for(i=0; decimal > 0; i++)
    {
        bin[i] = decimal % 2;
        decimal = decimal/2;
    }
    
    cout << "The binary number of the given decimal is: ";
    
    
    for(i=i-1; i>=0; i--)    
    {    
        cout<<bin[i];    
    }    
    

   return 0; 
}
