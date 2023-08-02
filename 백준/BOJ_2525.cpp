#include <iostream>
using namespace std;
int main(){
    int H,M;
    int minutes;
    cin >> H>>M;
    cin >> minutes;

    M += minutes;
    while(M>=60){
        M -= 60;
        H ++;
    }
    if(H>=24){
        H %= 24;
    }
    cout<< H<<" "<< M;
}