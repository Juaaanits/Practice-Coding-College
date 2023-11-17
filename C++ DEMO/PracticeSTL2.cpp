#include <iostream>
#include<vector>

using namespace std;

int main()
{
	vector<int> 	vecList= {1, 2, 3, 4};
    vecList.erase(vecList.begin());
    cout<<vecList[3] << endl;





	/*cout<<vecList(begin, 1)<<endl;
	vecList.push_back(9);
	vecList.push_back(9);
	vecList.push_back(9);
	vecList.push_back(9);
	vecList.push_back(9);
    vecList.pop_back();
    //vecList.pop_back();
    vecList.pop_back();
    //vecList.pop_back();
    vecList.shrink_to_fit();
	cout <<vecList.capacity() << endl;
    cout <<vecList.size() << endl;
    */

}
