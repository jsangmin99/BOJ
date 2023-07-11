#include<iostream>
using namespace std;
int divisor(int x){
    int cnt =0;
    for(int i=1; i<=x; i++){
        if(x%i == 0) cnt++;
    }
    return cnt;
}

int main(){
    int n;
    int result;
    cin >> n;
    for(int i = 1; i<=n; i++){
        result = divisor(i);
        cout << result;
    }
}