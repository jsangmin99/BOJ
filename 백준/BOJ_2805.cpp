//나무 자르기
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    long long n, m,x,result;
    long long sum =0;
    vector<long long> v;
    cin >> n >> m;
    for(int i = 0; i < n ; i++){
        cin >> x;
        v.push_back(x);
    }
    
    int min = 0;
    int max = *max_element(v.begin(), v.end());
    int mid = 0;
    
    while (min <= max){
        sum = 0;
        mid = (min + max) / 2;
        for (int i = 0; i < n; i++){
            if(v[i] > mid)
                sum += (v[i]-mid);
        }
        if(sum >=m){
            result = mid;
            min = mid+1;
        }else
            max = mid-1;
    }
    cout << result;

}