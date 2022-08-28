#include <iostream>
using namespace std;
int main ()
{
    int num;
    cout << "Enter a number: \n" ;
    cin >> num;
    
    if (num >= 0 && num<= 9) {
     cout << "Number read is less than 10 \n" ;
     
    }
      else if (num == 10){
       cout << "Number read is 10 \n";
       
      }
       else if (num >= 11 && num <= 99){
       cout<<"Number read is greater than 10 \n";
       }
         else if (num == 100){
             cout << "Number read is 100 \n ";
         }
             else if (num >= 101){
                 cout << "Number read is greater than 100 \n";
             }
    else {
    cout << "The number is negative \n";
    }
       
    return 0;
}





