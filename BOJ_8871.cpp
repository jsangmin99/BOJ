/* 경기는 n개의 라운드와 1번의 연습라운드로 이루어져있다.
한라운드에는 최소2번 최대 3번의 작업을 한다.
입력 값은 n , 출력 값은 최소 작업수 와 최대작업수*/

#include <iostream>
using namespace std;
int main(){
    int n;
    cin >>n;
    cout << (n+1) * 2 <<"\n";
    cout << (n+1) * 3;
}