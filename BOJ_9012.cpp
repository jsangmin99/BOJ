#include<iostream>
#include<stack>
#include<string>
using namespace std;
int main(){
    int n=0;
    int flag=0;
    string s;

    cin >> n;
    for(int i = 0; i < n; i++){
        stack<char> stk;
        cin >> s;
        for(int j = 0; j <s.length(); j++){
            if(s[j] == '('){
                stk.push(s[j]);
            }else if(s[j] == ')'){
                if(stk.empty()){
                    flag =1;
                    break;
                }else{
                    stk.pop();
                }
            }
        }
        if(!stk.empty()|| flag==1)
            cout << "NO\n";
        else
            cout << "YES\n";
        
    }
    return 0;
}