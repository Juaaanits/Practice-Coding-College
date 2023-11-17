#include <iostream>
#include<conio.h>
#include<vector>
#include<algorithm>

using namespace std;

class IntNumber
{
private:
    vector <int> userInput;
public:
	IntNumber();

    void askUser();
    void HighMidLow();
    void AscendingandDescending();
    void OddandEven();
    void inputAnother();

};

int main()
{
    IntNumber integer;

    integer.HighMidLow();
    integer.AscendingandDescending();
    integer.OddandEven();
    integer.inputAnother();

    return 0;

}

IntNumber::	IntNumber()
{
	askUser();
}

void IntNumber::askUser()
{

    cout << "Enter positive integers: ";
    userInput.clear();

    while (true)
    {
    	int input;
    	cin >> input;

    	if(input < 0)
    	{
    		break;
		}
		else
		{
			userInput.push_back(input);
		}

		system("cls");

		cout << "Enter positive integers: ";
		for(int positiveNumber : userInput)
		{
			cout << positiveNumber << " ";
		}
	}
}


void IntNumber::HighMidLow()
{
    sort(userInput.begin(), userInput.end());

    cout << "Low : " << userInput[0] << endl;


    int i, firstMiddle, secondMiddle;

    if (userInput.size() % 2 == 0)
        {
            i = userInput.size() / 2;
            firstMiddle = userInput[i - 1];
            secondMiddle = userInput[i];
            cout << "Mid: " << firstMiddle << ", " << secondMiddle << endl;

        }
    else
        {
            i = userInput.size() / 2;
            firstMiddle = userInput[i + 0.5];
            cout << "Mid: " << firstMiddle << endl;
        }

    cout << "High : " << userInput[userInput.size()-1] << endl;


}

void IntNumber::AscendingandDescending()
{

    sort(userInput.begin(), userInput.end(), less<int>());

	cout << "\n\n\nAscending: ";
	for (int i = 0; i < userInput.size(); i++)
		cout << userInput[i] << " ";
	cout << endl;


	sort(userInput.begin(), userInput.end(), greater<int>());

	cout << "\n\n\nDescending: ";
	for (int i = 0; i < userInput.size(); i++)
		cout << userInput[i] << " ";
	cout << endl;

}

void IntNumber::OddandEven()
{
    vector <double> even;
	vector <double> odd;
	for (int i = 0; i < userInput.size(); i++)
	{
		if (userInput[i] % 2 == 0)
		{
			even.push_back(userInput[i]);
		}
		else if (userInput[i] % 2 != 0)
		{
			odd.push_back(userInput[i]);
		}
	}

	cout << "\n\n\nOdd Numbers (As): ";
	for (int s = 0; s < odd.size(); s++)
		cout << odd[s] << " ";
	cout << "\n\n\nEven Number (As): ";
	for (int s = 0; s < even.size(); s++)
		cout << even[s] << " ";

}

void IntNumber::inputAnother()
{
	char response;
	cout << "\n\n\nTry another [Y/N]: ";
	cin >> response;

	if (response == 'Y')
	{
    IntNumber integer;

    integer.HighMidLow();
    integer.AscendingandDescending();
    integer.OddandEven();
    integer.inputAnother();


	}
	else if (response == 'N')
	{

	}
}

