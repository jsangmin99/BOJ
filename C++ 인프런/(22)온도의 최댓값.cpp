#include <iostream>
using namespace std;
int main(){
    int n, m, max =0;
    int arr[1000001];
    cin >> n >> m;
    for(int i = 0; i<n; i++){
        cin >> arr[i];
    }
    for (int i = 0; i < n-1; i++)
    {
        if(max < arr[i]+arr[i+1]){
            max = arr[i] + arr[i+1];
        }
    }
    cout << max;
    
}