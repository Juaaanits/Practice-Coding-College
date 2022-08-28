#include <iostream>
#include <cstring>
using namespace std; 

int main()
{
char inputString[1000];
int i, count[256] = {0};
cout<<"Enter a sentence and press ENTER key, please use lower case letters.\n";
gets(inputString); for(i=0; inputString[i] != '\0'; i++)
{
count[inputString[i]]++;
}
cout<< "\nYour sentence contains:\n"; for(i=0; i< 256; i++)
{
if(count[i] != 0)
{
cout<< count[i]<<" " << (char)i<<endl;
}
}
return 0;
}



