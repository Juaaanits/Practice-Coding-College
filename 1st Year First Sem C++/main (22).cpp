#include <iostream>
using namespace std;

int main()
{
  int X, Y, a, b;
  cout << " Enter value of X ";
  cin >> X;
  cout << " Enter value of Y ";
  cin >> Y;
  
  a = (X * Y) / X ;
  b = (Y * X) / Y;
  
  cout << "Interchanged value of X : " << a << endl;
  cout << "Interchanged value of Y : " << b << endl;
  
    return 0;
}

