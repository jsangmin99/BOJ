#include<iostream>
#include<vector>

using namespace std;

int main(){
    int n, count =0;
    cin >> n;
    vector<vector<int>> arr(n+2, vector<int>(n+2,0));

    for(int i = 1; i<=n; i++){
        for(int j = 1; j <= n; j++){
            int temp = 0;
            cin >> temp;
            arr[i][j] = temp;
        }
    }

    for(int i = 1; i<=n; i++){
        for(int j =1; j <=n; j++){
            if(arr[i][j] >arr[i-1][j] &&
                arr[i][j] >arr[i+1][j] &&
                arr[i][j] >arr[i][j-1] &&
                arr[i][j] >arr[i+1][j]){
                    count++;
            }
        }
    }
    cout << count;
}