#include<iostream>
using namespace std;
int main(){
    int n;
    int result = 0;
    vector<vector<int>> v;
    cin >> n;
    int x[n], y[n], xy[n][n];
    for(int i =0; i <n; i++){
        cin >> x[i];
    }
    for(int i =0; i <n; i++){
        cin >> y[i];
    }

    for(int i = 0; i < n; i++ ){
        for(int j =0; j < n; j++){
            xy[i][j] = x[i];
        }
    }

    for(int i =0; i < n; i++){
        for(int j =0; j < n; j++){
            if(xy[i][j] > y[n-i-1]){
                xy[i][j] = y[n-i-1];
            }
        }
    }
    for(int i=0; i<n; i++){
		for(int j=0; j<n; j++){
            cout << xy[i][j] << " ";
			result += xy[i][j];
		}
        cout << "\n";
	}
    cout << result;
}