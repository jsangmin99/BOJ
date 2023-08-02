#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main(int argc, char const *argv[]){
    int n;
    cin >> n;
    vector<pair<int,int>>schedule(n);
    
    for(int i= 0; i<n; i++){
        cin >>  schedule[i].second >> schedule[i].first; 
    }
    sort(schedule.begin(),schedule.end());
    int time = schedule[0].first;
    int count =1;
    for (int i=1; i < n; i++){
        if(time<=schedule[i].second){
            count ++;
            time = schedule[i].first;
        }
    }
    cout << count;
}

