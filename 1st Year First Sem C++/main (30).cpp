#include <iostream>
using namespace std;

int main ()
{
    int room_capacity, size_of_the_class, room_number, empty_seats;
    
    cout << "Enter the room number: \n ";
    cin  >> room_number;
    
     cout << "Enter the room capacity: \n";
     cin >> room_capacity;
     
    cout << "Enter no. of students enrolled \n";
    cin >> size_of_the_class;
    
    empty_seats = room_capacity - size_of_the_class;
    
    cout << "\n\n";
    
    cout << "Room No. \t Capacity \t Enrolled Students \t Empty Seats \t Status \n";
    if (room_capacity != size_of_the_class){
    cout << room_number << "\t\t " << room_capacity << "\t\t " << size_of_the_class << "\t\t\t " << empty_seats << "\t\t Available" << endl;   
    }
    else 
    {
    cout << room_number << "\t\t " << room_capacity << "\t\t " << size_of_the_class << "\t\t\t " << empty_seats << "\t\t Not Available" << endl; 
    }
    
   return 0; 
}






