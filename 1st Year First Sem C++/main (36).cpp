#include <iostream>
using namespace std;

void display();
void stdToMlt();
void mltToStd();
void displayTime (int hour, int min, string amOrPm);
void displayMltTime (int hour, int min);

char getSelection();

int getHour();
int getMin();
string getAmOrPm();

int main ()
{
    char choice = ' ';
    cout << "\t\tTime Conversion Program" << endl;
    
    display ();
    
    cout << "What is your choice?"; choice = getSelection();
    
    switch (choice)
    {
        case 'a':
        case 'A':
        
             stdToMlt ();
             break;
             
        case 'b':
        case 'B':
        
            mltToStd();
            break;
    }
    
system ("PAUSE");
return 0;
}
void display ()
{
    cout << "What kind of conversion will you use?" << endl;
    cout << "A. 12-24 hour format notation" << endl;
    cout << "or" << endl;
    cout << "B. 24-12 hour format notation" << endl;
    
}    

char getSelection ()
{
    char choice;
    cin >> choice;
    return choice;
}

void stdToMlt ()
{
    int hour;
    int min;
    string amOrPm = " ";
    
    cout << "Time(Hour)"; hour = getHour();
    cout << "Time(Min)"; min = getMin();
    cout << "AM or PM?"; amOrPm = getAmOrPm();
    
    if (amOrPm == "PM" || amOrPm == "pm")
    {
        hour = hour + 12;
        
    }
        displayMltTime (hour, min);
}
void mltToStd()
{
    int hour;
    int min;
    string amOrPm = " ";
    
    cout << "Time(Hour)"; hour = getHour ();
    cout << "Time(Min)"; min = getMin();
    
    if (hour % 12 == 0)
    {
        amOrPm = "AM";
    }
    else if(hour % 12 > 0)
    {
        amOrPm = "PM";
        hour = hour % 12;
    }
    displayTime (hour, min, amOrPm);
}   

int getHour()
{
    int hr;
    cin >> hr;
    return hr;
}
int getMin() {
    
    int mn;
    cin >> mn;
    return mn;
} 

string getAmOrPm()
{
    string ampm;
    cin >> ampm;
    return ampm;
}

void displayTime (int hour, int min, string amOrPm)
{
    char zero = ' ';
    if (min < 10)
    {
        zero = '0';
    }
    cout << endl << "Time: " << hour << ":" << zero << min << " " << amOrPm << endl;

}
    void displayMltTime(int hour, int min)
{
    char zero = ' ';
    char hrzero = ' ';
    
    if (hour < 10)
    {
        hrzero = '0';
    }
    if (min < 10)
    {
        zero = '0';
        
    }
    cout << endl << "Time: " << hrzero << hour << ":" << zero << min << endl;

    
}


    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    


