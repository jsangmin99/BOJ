#include <string>
#include <vector>
#include <stack>
#include <sstream>

using namespace std;

int solution(string s) {
    int answer = 0;
    
    stack<int> st;
    stringstream ss(s);
    string str;
    
    while(ss >> str){
        if(str=="Z") st.pop();        
        else st.push(stoi(str));
    }
    
    while(!st.empty()){
        answer+=st.top();
        st.pop();
    }
    
    return answer;
}