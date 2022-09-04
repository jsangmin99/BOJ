//Hashing
#include<iostream>
using namespace std;
int main(){
    long long n; //첫째줄
    string s; // 두쨰줄
    long long M = 1234567891;
    // 처음 제곱은 1부터 시작
    long long R = 1; 
    long long sum = 0;

    cin >> n;
    cin >> s;
    for (int i = 0; i < s.length(); i++){
        sum = (sum + (s[i] - 'a' + 1) * R) % M;
        R = (R * 31) % M; // 값이 계속 너무 커지므로 mod M
    }
    cout << sum;
}