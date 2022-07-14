#include<iostream>
#include<stack>
#include<string>
using namespace std;

int main(){
    while(true){
        string s;
        stack<char> stk;
        bool flag = false;
        getline(cin, s);

        if(s[0] == '.')break;
        
        for (int i = 0; i < s.length(); i++){
            if(s[i]=='(') stk.push('(');
            if(s[i]=='[') stk.push('[');
            if (s[i]==']'){
                if(!stk.empty() && stk.top() =='[') {
                    stk.pop();
                }else{
                    flag = true;
                }
            }

            if (s[i] == ')'){
                if(!stk.empty() && stk.top() =='('){
                    stk.pop();
                }else{
                    flag = true;
                }
            }  
        }

            if (stk.empty() && !flag) cout << "yes\n";
            else cout << "no\n";          
    }
}