#include<iostream>
using namespace std;

int main(){
    int a, b,c;
    int answer1 = 0;
    int answer2 = 0;
    cin >> a >> b >> c;

    answer1 = a + b - c;
    answer2 = stoi(to_string(a)+to_string(b)) - c;

    cout << answer1 << "\n" << answer2;

}