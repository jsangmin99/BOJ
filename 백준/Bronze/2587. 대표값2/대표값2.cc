#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int n,sum=0;
    int arr[5];
    for(int i =0; i < 5; i++){
        cin >> n;
        arr[i] = n;
        sum+=n;
    }
    sort(arr,arr+5);
    cout << sum/5 << "\n" << arr[2];
}