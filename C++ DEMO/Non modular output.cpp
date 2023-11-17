#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
	int input;
	cout <<"Please press enter key: ";
	input = getch();
	
	if(input == 13)
	{
		cout <<"You pressed enter key!";
		system("cls");
		goto proceed;
	}
	proceed:
		cout<<"\t\tTHAMKYOU FOR PRESSING";
return 0;
}
