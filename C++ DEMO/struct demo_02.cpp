//This program demonstrates the use of Array of Structures
#include<iostream>
#include<iomanip>
using namespace std;

const int NUMREC = 5;

struct StudentRec  //this is a global declaration
{
	int studentNo;
	char lastname[15];
	double average;
};



int main()
{
	StudentRec student[NUMREC] = {
		{202101,"Alpha", 1.00},
		{202102,"Beta", 1.25},
		{202103,"Charlie", 1.50},
		{202104,"Delta", 1.75},
		{202105,"Echo", 2.00}
	};
	
	cout << setiosflags(ios::left);    //left justify the output
	
	for (int i = 0; i<NUMREC; i++)
		cout<<setw(7)<<student[i].studentNo
		<<setw(15)<<student[i].lastname
		<<setw(6)<<student[i].average<<endl;


									
	
	return 0;
}
