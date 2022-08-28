
#include <iostream>

using namespace std;

struct Date
{
    int month, day, year;
};

int main()
{
    Date birth = {5, 29, 1980}, current = {8, 20, 2022}, tom;


    
    
    cout<<"Birthday: "<<birth.month<<"/"<<birth.day<<"/"<<birth.year<<endl;
    
    
    
    cout<<"Current: "<<current.month<<"/"<<current.day<<"/"<<current.year<<endl;
    
    cout<<"Enter the following: "<< endl;
    cout<<"Month: ";
    cin>>tom.month;
    cout<<"Day: ";
    cin>>tom.day;
    cout<<"Year: ";
    cin>>tom.year;
    
    cout<<"Tomorrow: "<<tom.month<<"/"<<tom.day<<"/"<<tom.year<<endl;
    
    return 0;
}
