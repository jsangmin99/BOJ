#include <iostream>
using namespace std;
int main(){
    int one, two,three,four;
    int sum;
    cin>> one >> two >> three >> four;
    sum = one+two+three+four;

    cout << sum/60 << "\n" << sum%60;
}