#include<iostream>
using namespace std;
int main ()
{
    int num, count = 0, bin [100];
    cout << "Enter a number of Base 10:";
    cin >> num ;
    for(int i=0; num > 0; i++){
        bin[i]=num%2;
        num = num / 2;
        count++;
        
    }
    cout << "\nBinary Equivalent is: ";
    for (int j=count-1; j>=0; j--){
        cout<<bin[j];
    }
}
