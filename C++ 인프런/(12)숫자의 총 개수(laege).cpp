#include<iostream>
using namespace std;

int main(){
    int n, sum =0, digit = 1, d =9, result= 0;
    cin >> n;

    while (sum + d < n)
    {
        result =result + (digit * d);
        sum += d;
        digit++;
        d = d*10;
    }

    result = result + ((n-sum)*digit);
    cout << result;
}