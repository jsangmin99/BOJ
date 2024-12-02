#include <iostream>
#include <string>

using namespace std;

int main() {
    int n;
    string s;
    bool flag = false;
    cin >> n;
    s = to_string(n);

    if (n % 7 == 0) {
        for (char c : s) {
            if (c == '7') {
                flag = true;
                break;
            }
        }
        if (flag) {
            cout << 3;
        } else {
            cout << 1;
        }
    } else {
        for (char c : s) {
            if (c == '7') {
                flag = true;
                break;
            }
        }
        if (flag) {
            cout << 2;
        } else {
            cout << 0;
        }
    }
    return 0;
}
