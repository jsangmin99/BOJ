#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main() {
    int n , score;
    vector<int> arr;
    cin >> n;
    for (int i = 0; i < n; i ++){
        cin >> score;
        arr.push_back(score);
    }
    sort(arr.begin(), arr.end(),greater<int>());

    arr.erase(unique(arr.begin(),arr.end()), arr.end());

    cout << arr[2];
    
}