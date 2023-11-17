/* #include <iostream>
using namespace std;
 
int main() 
{
    cout << "\n\n Find Size of fundamental data types :\n";
	cout << "------------------------------------------\n";
   cout << " The sizeof(char) is :          " << sizeof(char) << " bytes \n" ;
   cout << " The sizeof(short) is :         " << sizeof(short) << " bytes \n" ;
   cout << " The sizeof(int) is :           " << sizeof(int) << " bytes \n" ;
   cout << " The sizeof(long) is :          " << sizeof(long) << " bytes \n" ;
   cout << " The sizeof(long long) is :     " << sizeof(long long) << " bytes \n";
   cout << " The sizeof(float) is :         " << sizeof(float) << " bytes \n" ;
   cout << " The sizeof(double) is :        " << sizeof(double) << " bytes \n";
   cout << " The sizeof(long double) is :   " << sizeof(long double) << " bytes \n";
   cout << " The sizeof(bool) is :          " << sizeof(bool) << " bytes \n\n";
   return 0;
}
 */
 
 #include <iostream>
 
 using namespace std;
 
 class Size
 {
 	public:
 		Size();
 		
 		void charSize();
 		void shortSize();
 		void intSize();
 		void longSize();
		void longlongSize();
		void floatSize();
		void doubleSize();
		void longdoubleSize();
		void boolSize();		 
};
 
int main
{
	Size size;
	
	size.charSize();
	size.shortSize();
	size.intSize();
 	size.longSize();
	size.longlongSize();
	size.floatSize();
	size.doubleSize();
	size.longdoubleSize();
	size.boolSize();		
	
	return 0;
}

Size::Size()
{
	cout << "\n\n Find Size of fundamental data types :\n";
	cout << "------------------------------------------\n";
}

void Size::charSize()
{
	cout << " The sizeof(char) is :          " << sizeof(char) << " bytes \n" ;
}
void Size::shortSize()
{
	cout << " The sizeof(short) is :         " << sizeof(short) << " bytes \n" ;
}
void Size::intSize()
{
	cout << " The sizeof(int) is :           " << sizeof(int) << " bytes \n" ;
}
void Size::longSize()
{
	cout << " The sizeof(long) is :          " << sizeof(long) << " bytes \n" ;
}
void Size::longlongSize()
{
	cout << " The sizeof(long long) is :     " << sizeof(long long) << " bytes \n";
}
void Size::floatSize()
{
	cout << " The sizeof(float) is :         " << sizeof(float) << " bytes \n" ;
}
void Size::doubleSize()
{
	cout << " The sizeof(double) is :        " << sizeof(double) << " bytes \n";
}
void Size::longdoubleSize()
{
	cout << " The sizeof(long double) is :   " << sizeof(long double) << " bytes \n";
}
void Size::boolSize()
{
	cout << " The sizeof(bool) is :          " << sizeof(bool) << " bytes \n\n";
}
