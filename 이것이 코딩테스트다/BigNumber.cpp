#include <iostream>
#include <algorithm>

using namespace std;

int main(){
    int n, m, k;
    int result=0, cnt = 0;

    cin >> n >> m >> k;
    
    int arr[n];
    for(int i=0; i<n; i++){
        cin >> arr[i];
    }
    sort(arr, arr + n);

    while(cnt < m){
        for(int i = 0; i < k; i++){
            result += arr[n-1];
            cnt ++;
        }

        result += arr[n-2];
        cnt ++;
    }
    cout << result;
}   