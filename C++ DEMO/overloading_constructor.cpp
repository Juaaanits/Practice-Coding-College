//Abstract data types in C++

//WE NEVER DECLARE FUNCTIONS INSIDE THE STRUCTURES

//DECLARATION 

#include <iostream>
#include <iomanip>

using namespace std;
class Date // class declaration
{
private: //list of variable declarations
	//class members/structure
	int month; //member vaRIABLES
	int day;
	int year;	
public: //list of function prototypes
	//methods - member variables
	//Date(int = 1, int = 1, int = 1901); //constructor - inline function
	Date(); //default constructor
	Date(int);
	Date(int, int);
	Date(int, int, int);
	void setDate(int, int, int);
	void showDate();

};

int main()
{
	Date a ,b(5), c(5, 29), d(5, 29, 1980), e(1980);
	
	a.showDate();
	b.showDate();
	
	c.showDate();
	d.showDate(); 
	e.showDate();
	
	return 0;
}

//implementation section

//Date::Date(int mm, int dd, int yyyy)
Date::Date() //default constructor
{
	/*month = mm;
	day = dd;
	year = yyyy;
	*/
	month = 01;
	day = 01;
	year = 1901;
	cout<<"from default constructor"<<endl;
}

Date::Date(int mm) //constructor with month only
{
	month = mm;
	day = 1;
	year = 1901;
	cout<<"from constructor 1"<<endl;
	
}

Date::Date(int mm, int dd) //constructor with month and date
{
	month = mm;
	day = dd;
	year = 1901;
	cout<<"from constructor 2"<<endl;
}

Date::Date(int mm, int dd, int yyyy) //constructor with month and date
{
	month = mm;
	day = dd;
	year = yyyy;
	cout<<"from constructor 3"<<endl;
}

void Date::setDate(int mm, int dd, int yyyy)
{
	month = mm;
	day = dd;
	year = yyyy;
	
	return;
}

void Date::showDate()
{
	cout <<"The date is ";
	cout <<setfill('0')
		 <<setw(2) << month << '/'
		 <<setw(2) << day << '/'
		 <<setw(2) << year % 100; //extract the last 2 digits
 	cout << endl;
 	
 	return;
}


