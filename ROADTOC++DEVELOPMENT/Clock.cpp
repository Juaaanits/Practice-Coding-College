#include <iostream>
#include <windows.h>

using namespace std;

class Clock
{
	
private: 
	 int hour, minute, seconds, a, err;
public:
   
    Clock();
    void userInput();
    void body();
    

};


int main()
{

	Clock clock;
	
    clock.userInput();
    clock.body();

    return 0;
}

Clock::Clock()
{
	err = a = 0;
}

void Clock::userInput()
{
      while(err == 0)
    {

        cout << "Enter hour: " << endl;
        cin >> hour;

        cout << "Enter minutes: " << endl;
        cin >> minute;

        cout << "Enter seconds: " <<  endl;
        cin >> seconds;

        if (hour < 24 && minute < 60 && seconds < 60)
        {

            err++;
        }

        else
        {
             system("cls");
        }

    }

}

void Clock::body()
{
    while(a == 0)
    {
        system("cls");
        cout << hour << ":" << minute << ":" << seconds << endl;
        Sleep(1000);
        seconds++;

        if (seconds > 59)
        {
            seconds = 0;
            minute++;
        }
        if (minute > 59)
        {
            minute = 0;
            hour++;
        }
        if (hour > 24)
        {
            hour = 0;
        }

    }
}
