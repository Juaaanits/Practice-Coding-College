#include <iostream>
using namespace std;

//class declaration method

class Date
{
	private:
		int month;
		int day;
		int year;
	public:
		Date(int = 7, int = 4, int =2005);
};

// implementation section

Date::Date(int mm, int dd, int yyyy)
{
	month = mm;
	day = dd;
	year = yyyy;
	cout << "Created a new data object with data values "
		 << month << ", " << day << ", " << year << endl;
}
int main()
{
	Date k;    					// declare an object
	Date l;    					// declare an object
	Date c(4, 1, 2006);			//declare an object
	
	return 0;
}

