#include <iostream>
#include <vector>
#include <conio.h>
#include <istream>
#include <algorithm>

using namespace std;

class Integers
{
private:
	vector<int> Integer;
public:
	Integers();
	void askUser();
	void decLowMidHigh();
	void decOddEven();
	void decAscDesc();
	void askAgain();
};


int main()
{
	Integers m;
	m.decLowMidHigh();
	m.decAscDesc();
	m.decOddEven();
	m.askAgain();

}

Integers::Integers()
{
	askUser();
}
void Integers::askUser()
{
	cout << "Enter your positive integers: ";
	Integer.clear();

	while (true)
	{
		int inputUser;
		cin >> inputUser;

		if (inputUser < 0)
		{
			break;
		}
		else
		{
			Integer.push_back(inputUser);
		}
		system("cls");

		cout << "Enter your positiver integers: ";

		for (int posInt : Integer)
		{
			cout << posInt << " ";
		}
	}
}

void Integers::decLowMidHigh()
{
	// solving the lowest value

	int min = Integer.size();

	for (int l = 0; l < Integer.size(); l++)
	{
		if (Integer[l] < min)
		{
			min = Integer[l];
		}
	}
	cout << "\nLow: " << min;

	// solving the middle value
	int mid1, mid2;

	if (Integer.size() % 2 == 0)
	{
		int i{}, n;
		n = Integer.size() / 2;
		mid1 = Integer[n - 1];
		mid2 = Integer[n];
		cout << "\n\n\nMid: " << mid1 << ", " << mid2 << endl;

	}
	else
	{
		int i{}, n;
		n = Integer.size() / 2;
		mid1 = Integer[n + 0.5];
		cout << "\n\n\nMid: " << mid1 << endl;

	}
	// solving the highest value

	int max = Integer.size();

	for (int m = 0; m < Integer.size(); m++)
	{
		if (Integer[m] > max)
		{
			max = Integer[m];
		}
	}
	cout << "\n\n\nHigh: " << max;
}
void Integers::decAscDesc()
{
	sort(Integer.begin(), Integer.end(), less<int>());

	cout << "\n\n\nAscending: ";
	for (int i = 0; i < Integer.size(); i++)
		cout << Integer[i] << " ";
	cout << endl;


	sort(Integer.begin(), Integer.end(), greater<int>());

	cout << "\n\n\nDescending: ";
	for (int i = 0; i < Integer.size(); i++)
		cout << Integer[i] << " ";
	cout << endl;

}
void Integers::decOddEven()
{
	vector <double> even;
	vector <double> odd;
	for (int i = 0; i < Integer.size(); i++)
	{
		if (Integer[i] % 2 == 0)
		{
			even.push_back(Integer[i]);
		}
		else if (Integer[i] % 2 != 0)
		{
			odd.push_back(Integer[i]);
		}
	}

	cout << "\n\n\nOdd Numbers (As): ";
	for (int s = 0; s < odd.size(); s++)
		cout << odd[s] << " ";
	cout << "\n\n\nEven Number (As): ";
	for (int s = 0; s < even.size(); s++)
		cout << even[s] << " ";
}
void Integers::askAgain()
{
	char response;
	cout << "\n\n\nTry another [Y/N]: ";
	cin >> response;

	if (response == 'Y')
	{
		Integers m;
		m.decLowMidHigh();
		m.decAscDesc();
		m.decOddEven();
		m.askAgain();
	}
	else if (response == 'N')
	{

	}
}

