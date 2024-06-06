#include<iostream>
using namespace std;
int main(){
    long sum = 1;
    int N;
    cin >> N;
    if(N != 0)
        for(int i = 1; i <= N; i++){
            sum *=i;
        }
    cout << sum;
}