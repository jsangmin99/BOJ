#include<iostream>
using namespace std;
int main(){
    int n, arr[10001], cnt;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cout << "1 ";
    for (int i = 1; i < n; i++) {
        cnt =1;
        for (int j = i-1; j >= 0; j--) {
            if (arr[i] < arr[j]) cnt++;
        }
        cout << cnt<< " ";
    }

    
}