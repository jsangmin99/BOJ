#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main() {
    string s1, s2;
    cin >> s1 >> s2;

    vector<char> stack;

    for (int i = 0; i < s1.size(); i++) {
        stack.push_back(s1[i]);

        if (stack.size() >= s2.size()) {
            bool match = true;
            for (int j = 0; j < s2.size(); j++) {
                if (stack[stack.size() - s2.size() + j] != s2[j]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                for (int j = 0; j < s2.size(); j++) {
                    stack.pop_back();
                }
            }
        }
    }

    if (stack.empty()) {
        cout << "FRULA";
    } else {
        for (char c : stack) {
            cout << c;
        }
    }

    return 0;
}
