#include<iostream> 
using namespace std; 

int main () {
int num[50]; int i, j, desc;
cout <<"Enter the Students' Test Scores\n\n"; for(int i = 1; i <= 50; i++) {
cout <<"Student " <<i <<"\t"; cout <<"Test Score: "; cin>>num[i]; }
for (i = 1; i <= 50; ++i) { for (j = i + 1; j <= 50; ++j) { if (num[i] < num[j]) { desc = num[i];
num[i] = num[j];
num[j] = desc; }}}
cout<<"\n Numbers in Descending Order :\n";
 
for (i = 1; i <= 50; ++i) { cout<<" "; cout<<num[i]; cout<<"\n";
}
float tot=0; float mean=0;
for(int i=0; i<50; i++) { tot = tot+num[i]; } mean = tot/10;
cout<<"The mean value is: "<<mean <<endl; float mid=0;
if(50%2 == 0) {
int temp=(50/2)-1; for(int i=0;i<50;i++) {
if(temp==i || (temp+1)==i) { mid=mid+num[i]; }} mid=mid/2;
cout<<"Median value is: "<<mid; } else {

int temp=(50/2); for(int i=0;i<10;i++) { if(temp==i) {
int mid=num[i];
cout<<"Median value: "<<mid; }}} int z, tmp, maxCount, modeValue; int tally[50];
for(i=0;i<50;i++) { for(j=0;j<50
-i;j++)
{
if(num[j]>num[j+1]) { tmp=num[j]; num[j]=num[j+1];
num[j+1]=tmp; }}} for (i = 0; i < 50; i++) { for(z=i+1;z<50;z++) { if(num[i]==num[z]) {
tally[i]++; }}} maxCount = 0;
 
modeValue = 0;
for (i = 0; i < 50; i++) {
if (tally[i] > maxCount) { maxCount = tally[i]; modeValue = num[i]; }}
cout<<"\nMode value is : "<< modeValue <<endl; return 0; }







