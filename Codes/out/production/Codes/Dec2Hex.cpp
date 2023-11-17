/*#include <iostream>
using namespace std;

int main()
{
    int bin[1000], decimal, i;
    
    cout << "Input a decimal number: ";
    cin >> decimal;
    
    for(i=0; decimal > 0; i++)
    {
        bin[i] = decimal % 16;
        decimal = decimal/16;
    }
    
    cout << "The hexadecimal number of the given decimal is: ";
    
    
    for(i=i-1; i>=0; i--)    
    {    
        cout<<bin[i];    
    }    
    

   return 0; 
}
*/

#include<iostream>
using namespace std;
int main ()
{
    int num, temp, i = 1, j, r;
    char hex[50];
    cout << " Enter a decimal number : ";
    cin >> num;
    temp = num;
    while (temp != 0)
    {
        r = temp % 16;
        if (r < 10)
            hex[i++] = r + 48;
        else
            hex[i++] = r + 55;
        
        temp = temp / 16;
    }
    cout << "\nHexadecimal equivalent of " << num << " is : ";
    for (j = i; j > 0; j--)
        cout << hex[j];
    return 0;
}
