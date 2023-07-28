#include<iostream>
using namespace std;
int main(){
    int n, arr[101];
    bool flag = false;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >>arr[i];
    }
    
    for (int i = 1; i < n; i++)
    {
        if(abs(arr[i-1]-arr[i]) > n-1)
            flag= true;
        else flag = false;
    }
    if(flag)
        cout << "No";
    else
        cout << "YES"; 
}