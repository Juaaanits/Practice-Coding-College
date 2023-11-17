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
	Date(int = 7, int = 4, int = 2005); //constructor - inline function
	void setDate(int, int, int);
	void showDate();

};

/*int main()
{
	Date current; 
	
	current.month=9;
	current.day=5;
	current.year=2022;
	
	current
	
	return 0;
}*/

//implementation section

Date::Date(int mm, int dd, int yyyy)
{
	month = mm;
	day = dd;
	year = yyyy;
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

int main()
{
	Date a, b, c(4, 1, 2000); //declare 3 objects
	
	b.setDate(7, 8, 2003);  //assign value to b's data members
	a.showDate();             //display object a's values
	b.showDate();             //display b's values
	c.showDate();             //display c's values
	
	return 0;
}
