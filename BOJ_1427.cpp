#include<iostream>
#include<vector>
#include <algorithm>
using namespace std;
int main(){
    vector<int> v ={};
    int n;
    int len;

    cin>> n;
    while (n>0){
        v.push_back(n % 10);
        n/=10;
        len++;
    }
    
    sort(v.begin(),v.end(),greater<int>());
    for(int i=0;i<v.size();i++){
        cout<< v[i];
    }

}