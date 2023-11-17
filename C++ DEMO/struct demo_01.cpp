//This program demonstrates the use of Single Structures

#include<iostream>
using namespace std;

struct Date //this is global declaration
{
	int month;
	int day;
	int year;
};

int main()
{
	Date birth = {10, 14, 20};
	
	cout<<"My birthdate is: "<<birth.month<<'/'
		<<birth.day<<'/'
		<<birth.year<<endl;
		
	
	return 0;
}


