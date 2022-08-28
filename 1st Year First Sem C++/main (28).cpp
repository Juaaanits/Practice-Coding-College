/*
Multiplication Table (10 * 10)
*/
#include <iostream>

using namespace std;

int main(void)
{
 int x,y;
 char waitInput;

 for(x=1; x<=10; x++)
 {
  for(y=1; y<=10; y++)
  {
   //use horizontal tab (\t) to align properly
   cout << "\t" << (x*y);
  }

  //newlines
  cout<<endl<<endl;
 }

 cin>>waitInput;
 return 0;
}

