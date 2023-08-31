#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

bool sssort(pair<int, int> a, pair<int, int> b){
    return a.second < b.second;
}

int main(){
    int n,k;
    vector <pair<int,int>> time;
    cin >> n;
    for(int i =0; i <n; i++){
        int temp =0;
        cin >> temp;
        time.push_back(make_pair(temp, i+1));
    }
    cin >> k;

    sort(time.begin(), time.end());

    int prev_number = 0;

    for(vector<pair<int,int>>::iterator i = time.begin(); i != time.end(); i++, n-- ){
        int timeGap = i -> first - prev_number;
        long long spendTime = (long long)timeGap * n;

        if(timeGap == 0) continue;

        if(spendTime <= k){
            k -= spendTime;
            prev_number = i -> first;
        }
        else{
            k %= n;
            sort(i, time.end(), sssort);
            cout << (i + k)->second;
        }

    }
}
