#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main() {
    int N;
    string s;

    cin >> N;
    cin.ignore(); // 버퍼 비우기

    for (int i = 0; i < N; i++) {
        getline(cin, s);
        s += " ";
        stack<char> st;

        for (int j = 0; j < s.size(); j++) {
            if (s[j] != ' ') {
                st.push(s[j]);
            }else {
                while (!st.empty()) {
                    cout << st.top();
                    st.pop();
                }
                cout << ' ';
            }
        }
        cout << "\n";
    }

    return 0;
}
