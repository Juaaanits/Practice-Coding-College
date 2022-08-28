#include <iostream> 
#include <algorithm>
using namespace std; 
int main ()
{
int A[] = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114,
115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131,
132, 133, 134, 135, 136, 137, 138, 139};
int B[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39};
int n = sizeof(A)/sizeof(A[0]); int o = sizeof(B)/sizeof(B[0]);
cout<<"ORIGINAL ARRAYS\n\n";
cout<< "A[]: ";
for (int i = 0; i< n; i++) cout<< A[i] << " "; cout<<"\n\n"; cout<< "B[]: ";
for (int i = 0; i< o; i++) cout<< B[i] << " ";
cout<<"\n\nINTERCHANGED ARRAYS\n\n"; reverse(B, B+o);
cout<< "A[] = ";
for (int i=0; i<40; i++) cout<< B[i] << ","; cout<<"\n"; reverse(A, A+n); cout<< "\nB[] = "; for (int i=0; i<40; i++) cout<< A[i] << ", "; return 0;
}

