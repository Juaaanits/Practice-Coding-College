//Abstract data types in C++

//WE NEVER DECLARE FUNCTIONS INSIDE THE STRUCTURES

//DECLARATION 

#include <iostream>
#include <iomanip>

using namespace std;
class Date // class declaration
{
public: 
	//class members/structure
	int month; //member vaRIABLES
	int day;
	int year;
	
public:
	//methods - member variables
	Date(int = 1, int 1, int = 0001); //constructor - inline function
	void setDate(int, int, int);
	void showDate();

};

int main()
{
	Date current; 
	
	current.month=9;
	current.day=5;
	current.year=2022;
	
	return 0;
}
