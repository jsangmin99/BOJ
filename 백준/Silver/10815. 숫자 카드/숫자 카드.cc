#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int n,m;
vector<int> arr;
vector<int> arr2;

int Search (vector<int>&arr,int target, int start, int end) {
    while(start <= end) {
        int mid = (start + end) /2;

        if(arr[mid]==target)
            return mid;
        else if (arr[mid]>target)
            end = mid-1;
        else
            start = mid+1;
    }
    return -1;
}

int main() {
    cin >> n;

    for (auto i = 0; i < n; i++) {
        int x;
        cin >> x;
        arr.push_back(x);
    }
    sort(arr.begin(),arr.end());
    
    cin >> m;
    for (auto i = 0; i < m; i++){
        int x;
        cin >> x;
        arr2.push_back(x);
    }
    for (auto i = 0; i < m; i++){
        int result = Search(arr,arr2[i],0,n-1);
        if(result!=-1) {
            cout << "1" << " ";
        }else cout <<"0" << " ";
    }
}