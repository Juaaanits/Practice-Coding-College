#include <iostream>
#include <fstream>
#include <cstring>

using namespace std;

bool LogIn()
{
    string username, password, un, pw;

    cout << "Enter username: ";
    cin>>username;
    cout<<"Enter password: ";
    cin>>password;

    ifstream read("C\\"+username+".txt");
    getline(read, un);
    getline(read, pw);

    if (un == username & pw = password)
    {
        return true;
    }
    else
    {
        return false;
    }



}
int main()
{
    int choice;

    cout <<"1. Register"<<endl;
    cout <<"2. Login"<<endl;
    cout <<"3. Your choice: "<<endl;
    cin>> choice;

    if(choice == 1)
    {

        string username, password;

        cout<<"Select a username: "<<endl;
        cin>>username;
        cout<<"Select a password: "<<endl;
        cin>>password;

        ofstream file;
        file.open("C\\" + username +".txt");

        file<<username<<endl<<password;
        file.close();

        main();
    }

    else if(choice == 2)
    {
        bool status = LogIn();

        if(!status)
        {

            cout<<"False Login!"<<endl;
            system("PAUSE");
            return 0;
        }
        else
        {
            cout<<"Successfully logged in! "<<endl;
            system("PAUSE");
            return 1;
        }
    }
}
