#include<iostream>
#include<algorithm>
using namespace std;
int main(){
    string n;

    while(n !="0"){
        cin >> n;
        string original = n;
        reverse(n.begin(), n.end());

        if(n=="0")
            break;
        else if(n==original)
            cout << "yes"<< "\n";
        else
            cout << "no" << "\n";
    }
}