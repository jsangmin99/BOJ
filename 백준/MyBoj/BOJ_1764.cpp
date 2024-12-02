//듣보잡
#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main(){
    int N, M, cnt=0;
    string s;
    vector<string> v, result;
    cin >> N >> M;
    for (int i=0; i < N + M;i++){
        cin >>s;
        v.push_back(s);
    }
    sort(v.begin(),v.end());
    for(int i = 0; i < N+M-1; i++){
        if(v[i] == v[i+1]){
            cnt += 1;
            result.push_back(v[i]);
        }
    }
    cout << cnt << "\n";
    for(int i=0; i<result.size(); i++){
        cout << result[i] << "\n";
    }
}