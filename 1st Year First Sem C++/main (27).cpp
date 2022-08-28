#include<iostream>
using namespace std;

int main() 
{
	int num, factorial=1;
	cout << "Input a number: " << endl;
	cin >> num;
	
	if (num < 0)
	   cout << "Can't find the factorial for negative number ";
	else if (num <= 1)
	   cout << num << "! =" << factorial;
	else {
	for (int a = 1; a <= num; a++) {
		factorial = factorial * a;
	}
	}
	cout << "\n\n";
	cout << "The factorial value is: \n";
	cout << factorial; 
	return 0;
}


