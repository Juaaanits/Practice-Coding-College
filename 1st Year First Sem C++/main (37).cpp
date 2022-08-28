#include <iostream>
#include <cmath>
using namespace std;

int main (){
    int x, square, square_root, fourth_power ;
    cout << "Number \t\t Square \t\tSquare Root \t\tFourth Power \t\t";
    
    for (int x=0; x <= 25; x++){
        double square = x * x ;
        double square_root = sqrt (x);
        double fourth_power = x * x * x * x ;
        
        cout << "\n" << x << "\t\t  " << square << "\t\t\t" << square_root << "\t\t\t" << fourth_power;
        
    }
}








