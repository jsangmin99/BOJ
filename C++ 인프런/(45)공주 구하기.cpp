#include<iostream>
#include<deque>

using namespace std;
int main(){
    int n, k;
    deque<int> dq;
    cin >> n >> k;

    for(int i = 1; i <= n; i++){
        dq.push_back(i);
    }

    while(dq.size() > 1){
        for(int i =1; i < k; i++){
            dq.push_back(dq.front());
            dq.pop_front();
        }
        dq.pop_front();
    }
    cout << dq.front();
}