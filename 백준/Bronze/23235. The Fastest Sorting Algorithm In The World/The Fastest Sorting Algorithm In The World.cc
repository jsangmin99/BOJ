#include <iostream>
using namespace std;

int main()
{
    int n =1;
    while(true){
        string s="";
        getline(cin, s);
        if(s[0] == '0') break;
        cout << "Case "<< n <<": Sorting... done!\n";
        n++;
    }
    return 0;
}