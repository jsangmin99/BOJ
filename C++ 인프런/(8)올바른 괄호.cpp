#include <iostream>
#include <stack>
#include <string>

using namespace std;

string checkParentheses(const string& parentheses) {
    stack<char> s;

    for (int i = 0; i < parentheses.length(); i++) {
        if (parentheses[i] == '(') {
            s.push(parentheses[i]);
        } else if (parentheses[i] == ')') {
            if (s.empty() || s.top() != '(') {
                return "NO";
            }
            s.pop();
        }
    }

    return s.empty() ? "YES" : "NO";
}

int main() {
    string parentheses;
    cin >> parentheses;

    cout << checkParentheses(parentheses) << endl;

    return 0;
}
