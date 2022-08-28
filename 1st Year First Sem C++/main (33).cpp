#include <iostream>
#include <math.h>
using namespace std;

int main (){
    int x, sin_num, cos_num, tan_num;
    cout << "Number \t\t Sine \t\t Cosine \t\t Tangent \t\t";
    
    for (int x=1; x <= 10; x++){
        double sin_num = sin(x);
        double cos_num = cos(x);
        double tan_num = tan(x);
        
        cout << "\n" << x << "\t\t" << sin_num << "\t\t" << cos_num << "\t\t" << tan_num;
        
    }
}

