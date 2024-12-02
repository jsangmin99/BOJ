#include <iostream>
using namespace std;
int main(){
    int n,sum,cnt=0;
    cin >>n>> sum;
    int arr[n];
    for(int i = 0; i<n; i++){
        cin >> arr[i];
    }
    for(int i=n-1; i>=0; i--){
        cnt += sum/arr[i];
        sum %= arr[i];
    }
    cout << cnt;
}