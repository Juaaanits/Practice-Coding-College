//This program demonstrates the use of Array of Structures
//Ask the user to enter studentNo, lastname, and 2 quizzes
//Create a function to get an average of the 2 quizzes and use the structure as function argument

#include<iostream>
#include<iomanip>

using namespace std;

const int NUMREC = 5;

struct StudentRec  //this is a global declaration
{
	int studentNo;
	char lastname[15];
	int q1, q2;
	double average;
};

double getAverage(StudentRec);   //function prototype

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
		cout<<"Quiz 1: ";
		cin>>student[x].q1;	
		cout<<"Quiz 2: ";
		cin>>student[x].q2;	
		student[x].average=getAverage(student[x]);
	}
	
	
	//display the record coming from the user
	cout << setiosflags(ios::left)<<endl;    //left justify the output
	cout<<fixed<<setprecision[2]<<endl;
	
	for (int i = 0; i<NUMREC; i++)
		cout<<setw(7)<<student[i].studentNo
		<<setw(15)<<student[i].lastname
		<<setw(6)<<student[i].average<<endl;
									
	return 0;
}

//function implementation
double getAverage(StudentRec temp)  //temp is the data type studentRec
{
	return (temp.q1 + temp.q2)/2;
}


