#include <iostream>
using namespace std;

int
main ()
{
  char first_name [13] , middle_initial [2], surname [11];
  int salary, bonus1, bonus2;
  cout << "Enter the first name: \n" << endl;
  cin >> first_name; 
  
  cout << "Enter the middle initial: \n" << endl;
  cin >> middle_initial;
  
  cout << "Enter the surname: \n " << endl;
  cin >> surname;
  
  cout << "Enter the amount of salary: \n" << endl;
  cin >> salary;
   
   bonus1 = 0.50 * salary;
   bonus2 = 7000;
  
  cout << "\n";
  cout << "\n";
  cout << "============================================================================================================= \n";
  cout << "Name of the Employee: " << first_name << " " << middle_initial << " " << surname << endl;
  
  cout << "Employee's Salary: \n" << salary << endl;
  
  if (salary <= 7000){
  cout << "Employee's Bonus: \n" << bonus1 << endl;
  }
  if (salary > 7000){
  cout << "Employee's Bonus: \n" << bonus2 << endl;
  }
  
  return 0;
}
























