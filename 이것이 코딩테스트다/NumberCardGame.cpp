#include<iostream>
#include<algorithm>
using namespace std;

int main(){
    int n, m;
    int result =0;
    cin >> n >> m;

    int arr[n][m];
    for(int i =0; i < n; i++){
        for(int j =0; j < m; j++){
            cin >> arr[i][j];
        }
    }
    for(int i=0;i<n;i++)
    {
        int min=10001; 
        for(int j=0;j<m;j++)
        {
            if(min>arr[i][j])
            {
                min=arr[i][j];
            }
        }
        if(result<min)
        {
            result=min;
        }
        
    }
    cout << result;
}