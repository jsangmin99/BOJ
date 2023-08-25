#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main(){
    int n, m, temp;
    vector<int> arr1;
    cin >> n;
    for(int i =0; i < n; i++){
        temp =0;
        cin >> temp;
        arr1.push_back(temp);
    }
    cin >> m;
    for(int i = 0; i < m; i++){
        temp =0;
        cin >>temp;
        arr1.push_back(temp);
    }

    sort(arr1.begin(), arr1.end());

    for(int i =0; i < arr1.size(); i++){
        cout << arr1[i] << " ";
    }

}