#include <iostream>
int main( )
{
 using namespace std;
 int i, score[20], max;
 cout << "Enter 20 scores:\n";
 cin >> score[0];
 max = score[0];
 for (i = 1; i < 20; i++)
 {
 cin >> score[i];
 if (score[i] > max)
 max = score[i];
 //max is the largest of the values score[0],..., score[i].
 }
 cout << "The highest score is " << max << endl
 << "The scores and their\n"
 << "differences from the highest are:\n";
 for (i = 0; i < 20; i++)
 cout << score[i] << " off by " << (max - score[i]) << endl;
 return 0;
}


