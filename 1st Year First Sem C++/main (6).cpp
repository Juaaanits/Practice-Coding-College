 #include<iostream>
using namespace std;

int main()
{
int n,m,b,reversenumber1 = 0, reversenumber2 = 0, reversenumber3 = 0,remainder;

cout<< "Enter Integer 1: ";
    cin >> n;
    
    while(n != 0) {
        remainder = n%10;
        reversenumber1 = reversenumber1*10 + remainder;
        n /= 10;        
    }
    
    cout<< "Enter Integer 2: ";
    cin >> m;
    
    while(m != 0) {
        remainder = m%10;
        reversenumber2 = reversenumber2*10 + remainder;
        m /= 10;
    }

cout<< "Enter Integer 3: ";
    cin >> b;
    
    while(b != 0) {
        remainder = b%10;
        reversenumber3 = reversenumber3*10 + remainder;
        b /= 10;
    }

cout<< "Reverse number 1= "<< reversenumber1<<endl;
cout<< "Reverse number 2= "<< reversenumber2<<endl;
cout<< "Reverse number 3= "<< reversenumber3<<endl;
return 0;
}
