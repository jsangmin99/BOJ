#include<iostream>
using namespace std;
int main(){
    int T, alcohol;
    cin >> T >> alcohol;
    if(alcohol == 1 || T <= 11 || T >16){
        cout << 280;
    }else{
        cout << 320;
    }
    return 0;
}