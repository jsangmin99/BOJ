#include<iostream>
using namespace std;
int fac(int n) {
    int countZeros = 0;
    for (int i = 5; n / i >= 1; i *= 5) {
        countZeros += n / i;
    }
    return countZeros;
}
int main(){
    int n;
    cin >> n;
    int zeros = fac(n);
    cout << zeros << endl;
}