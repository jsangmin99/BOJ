#include <iostream>
#include <string>
#include <algorithm>
#include <stack>
using namespace std;

int solution(string s)
{
    int answer = 0;
    stack<char> stk;
    //if(s.empty() || s.size() % 2 != 0)
    //    return answer;

    for(int i = 0; i < s.size() ; i++)
    {
        if(stk.empty() || stk.top() != s[i])
            stk.push(s[i]);
        else
            stk.pop();
    }

    if(stk.empty())
        answer++;

    return answer;
    
}