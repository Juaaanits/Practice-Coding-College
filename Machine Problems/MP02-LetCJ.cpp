#include <conio.h>
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Integer
{
private:
	vector <int> userInput;
public:
	Integer();
	void askUser();
	void position();
	void arrangment();
	void divisible();
	void loop();
};


int main()
{
	Integer p;
	p.askUser();
	p.position();
	p.arrangment();
	p.divisible();

}

Integer::Integer()
{
	askUser();
}


//Methods
void Integer::askUser()
{
	cout << "Enter positive integer: ";
	userInput.clear();

	while (true)
	{
		int input;
		cin >> input;

		if (input < 0)
		{
			break;
		}

		else
		{
			userInput.push_back(input);
		}

		system("cls");

		cout << "Enter positive integer: ";
		for (int i : userInput)
		{
			cout << i << " ";
		}
	}

}

void Integer::position()
{
	int i, n;
	double smallest, largest, mid1, mid2;
	smallest = userInput[i];
	largest = userInput[i];


	for (i = 1; i < userInput.size(); i++)
	{
		if (userInput[i] < smallest)
		{
			if (userInput[i] < smallest)
				smallest = userInput[i];
			if (userInput[i] > largest)
				largest = userInput[i];
		}

		cout << endl << "Low: " << smallest << endl;

	}

	if (userInput.size() % 2 == 0)
	{
		n = userInput.size() / 2;
		mid1 = userInput[n - 1];
		mid2 = userInput[n];
		cout << "Mid: " << mid1 << ", " << mid2;
	}

	else
	{
		n = userInput.size() / 2;
		mid1 = userInput[n + 0.5];
		cout << "Mid: " << mid1;
	}

	cout << "Highest: " << largest << endl;

}

void Integer::arrangment()
{
	sort(userInput.begin(), userInput.end(), less<int>());

	cout << "Ascending: ";
	for (int i = 0; i < userInput.size(); i++)
		cout << userInput[i] << " ";


	sort(userInput.begin(), userInput.end(), greater<int>());

	cout << "Descending: ";
	for (int i = 0; i < userInput.size(); i++)
		cout << userInput[i] << " ";



}

void Integer::divisible()
{
	vector <double> even;
	vector <double> odd;
	for (int p = 0; p < userInput.size(); p++)
	{
		if (userInput[p] % 2 != 0)
		{
			odd.push_back(userInput[p]);
		}

		else
		{
			even.push_back(userInput[p]);
		}

	}


	cout << "Odd Numbers (As): ";
	for (int k = 0; k < odd.size(); k++)
		cout << odd[k] << " ";
	cout << endl << "Even Number (As): ";
	for (int k = 0; k < even.size(); k++)
		cout << even[k] << " ";
	cout << endl;


}

void Integer::loop()
{
	Integer p;
	char answer;

	cout << "Try another [y/n]: ";

	cin >> answer;

	if (answer == 'y')
		{
		system("cls");
		p.askUser();
		}

	else if (answer == 'n')
	{
		system("end");
	}
}
