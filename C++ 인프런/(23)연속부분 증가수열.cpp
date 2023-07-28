#include<iostream>
using namespace std;
int main (){
    int n, pre=0, now=0,cnt =0, max = 0;
    int arr[1000001];
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    for (int i =1; i<n; i++){
        if(arr[i]>=arr[i-1]){
            cnt++;
            if(cnt>max){
                max =cnt;
            }
        }else{
            cnt = 1;
        }
    }
    cout << max;
}