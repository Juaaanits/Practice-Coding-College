// class declaration

class Date
{
	private:
		int month;
		int day;
		int year;
	public:
		Date(int = 7, int = 4, int = 2005);     //constructor
		Date(long);                  // another constructor
		void showDate();             //member function to display a date
};

//implementation section

Date::Date(int mm, int dd, int yyyy)
{
	month = mm;
	day = dd;
	year = yyyy;
}

Date::Date(long yyyymmdd)
{
	year = int(yyyymmdd/1000.0);     //extract the year
	month = int(  (yyyymmdd - year * 1000.0)/100.00 );   //extract the month
	day = int(yyyymmdd - year * 1000.0- month * 100.00);  //extract the day
}


