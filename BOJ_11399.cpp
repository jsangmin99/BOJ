#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main(){
    int n,sum=0;
    cin >>n;
    vector<int> v;

    for(int i=0; i<n;i++){
        int x;
        cin>> x;
        v.push_back(x);
    }
    sort(v.begin(), v.end());
    for(int i=0; i<n; i++){
        sum += v[i] *(n-i);
    }
    cout << sum;
}