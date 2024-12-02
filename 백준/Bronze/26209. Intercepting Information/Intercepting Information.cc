#include <iostream>

using namespace std;

int main()
{
    int a;
    bool f=true;
    for(int i=0; i<8; i++){
        cin >>a;
        if(a==9) f = false;
    }
    if(f==false) cout << "F";
    else cout << "S";

}