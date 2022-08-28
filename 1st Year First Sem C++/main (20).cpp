#include <iostream>
#include <math.h>

using namespace std;

int main()
{
    
    char item [11], response;
    double itemCount, itemPrice, totalPrice, vatTotalPrice, vatPrice, tenderedAmount, changeAmount;

    cout << "Please enter the item code: ";
    cin >> item;

    cout << "Please enter how many will be purchased: ";
    cin >> itemCount;


    cout << "Please enter the price of the item purchased: ";
    cin >> itemPrice;

    cout << "Please enter your tendered amount: ";
    cin >> tenderedAmount;


    cout << "\nAre you sure you wish to purchase ";
    cout << itemCount;
    cout << " ";
    cout << item;
    cout << "(s) for ";
    cout << itemPrice;
    cout << "PHP each?";
    cout << " (y/n) : ";
    cin >> response;

    totalPrice = itemCount * itemPrice;
    vatTotalPrice = (totalPrice * 0.06) + totalPrice;
    vatPrice = totalPrice * 0.06;
    changeAmount = tenderedAmount - vatTotalPrice;

    if (vatTotalPrice > tenderedAmount) {
        cout << "\n\n\n\nYou don't have enough money. Please try again.\n\n\n\n";
        return 0;
    } 
    else {

        if (response == 'y') {

            cout << "\n\n\n\nItem Code\tNo. of item(s)\t\tItem Price\tTotal\n" << endl;
            cout << item;
            cout << "\t\t";
            cout << itemCount;
            cout << "\t\t\t";
            cout << itemPrice;
            cout << "\t\t";
            cout << totalPrice;
            cout << "\t\t\n\n\n\n";

            cout << "VAT 6%: ";
            cout << vatPrice;

            cout << "\nTotal Cost: ";
            cout << vatTotalPrice;

            cout << "\nAmount Tendered: ";
            cout << tenderedAmount;

            cout << "\nTotal Change: ";
            cout << changeAmount;
            cout << "\n\n\n\n";

            return 0;

        }
        else if (response == 'n') {

            cout << "\nThank you for using this product!\n\n\n";
            return 0;
        }
        else {
            cout << "\nThat is not a valid response. Please try again.\n\n\n";
            return 0;
        }

    }

    return 0;

}



    


