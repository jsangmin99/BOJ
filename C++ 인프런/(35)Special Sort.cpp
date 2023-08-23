#include<iostream>
#include<vector>
using namespace std;
int main(){
    int n;
    vector<int> plus;
    vector<int> minus;

    cin >>n;
    for(int i = 0; i < n; i++){
        int temp = 0;
        cin >> temp;
        if(temp < 0){
            minus.push_back(temp);
        }else if(temp > 0){
            plus.push_back(temp);
        }
    }

    for(int i =0; i < minus.size(); i++){
        cout << minus[i] << " ";
    }
    for(int i =0; i < plus.size(); i++){
        cout <<plus[i] << " ";
    }
}