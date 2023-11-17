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
	StudentRec student[NUMREC];
	
	cout<<"Enter the following records: "<<endl;
	
	//ask student records from the user
	for (int x = 0; x<NUMREC;x++)
	{
		cout<<"Student Record ["<<x+1<<"]: "<<endl;
		cout<<"Student No. :";
		cin>>student[x].studentNo;
		cout<<"student Lastname: ";
		cin>>student[x].lastname;
		cout<<"Average : ";
		cin>>student[x].average;
	}
	
	
	//display the record coming from the user
	cout << setiosflags(ios::left);    //left justify the output
	cout<<fixed<<setprecision[2];
	
	for (int i = 0; i<NUMREC; i++)
		cout<<setw(7)<<student[i].studentNo
		<<setw(15)<<student[i].lastname
		<<setw(6)<<student[i].average<<endl;
									
	return 0;
}
