#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main()
{
double x, r;
double sin(x), cos(x), tan(x);
double PI = 3.1415926;

for (x = 0:10:360)
 r= x * PI /180.0;
 cout << "The sin of:" << x << "is:" <<sin(r) << "\n" << endl;
 cout << "The cos of:" << x << "is:" <<cos(r) << "\n" << endl;
 cout << "The tan of:" << x << "is:" <<sin(r)/cos(r) << "\n" << endl;

 return 0;



}

