#include<iostream>
#include<stack>
using namespace std;
int main(){
    int n;
    string word;
    stack<int> stk;

    cin >> n;

    for(int i = 0; i < n; i++){
        cin >> word;
        if (word=="push"){
            int num;
            cin >> num;
            stk.push(num);
        
        }else if(word == "pop"){
            if(stk.empty()){
                cout << "-1"<<"\n"; 
            }else{
                cout << stk.top() << "\n";
                stk.pop();
            }

        }else if(word == "size"){
            cout << stk.size()<<"\n";

        }else if(word == "empty"){
            if(stk.empty()) cout << "1" << "\n";
            else cout << "0" << "\n";

        }else if(word == "top"){
            if(stk.empty()){
                cout << "-1" << "\n";
            }else{
                cout << stk.top()<<"\n";
            }
        }
    }

}