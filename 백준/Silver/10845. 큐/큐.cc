#include<iostream>
#include<queue>
using namespace std;
int main(){
    queue<int> q;
    int n=0;
    cin >> n ;
    for(int i = 0; i< n; i++){
        string s;
        int num = 0;
        cin >> s;

        if(s == "push"){
            cin >> num;
            q.push(num);
        }else if(s == "pop"){
            if(q.empty()){
                cout << -1 << "\n";
            }else{
                cout << q.front() << "\n";
                q.pop();
            }
        }else if(s == "size"){
            cout << q.size()<< "\n";
        }else if(s == "empty"){
            if(q.empty()) cout << 1 << "\n";
            else cout << 0 << "\n";
        }else if(s == "front"){
            if(q.empty()) cout << -1 << "\n";
            else cout << q.front() << "\n";
        }else if(s == "back"){
            if(q.empty()) cout << -1 << "\n";
            else cout << q.back() << "\n";
        }
    }

}