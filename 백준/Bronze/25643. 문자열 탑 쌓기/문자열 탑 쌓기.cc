#include<iostream>
#include<string>
using namespace std;

int main() {
    int N, slen;
    cin >> N >> slen;
    string old;
    cin >> old;

    for (int i = 0; i < N-1; i++) {
        bool chk = false;
        string s;
        cin >> s;

        if (old == s) {
            chk = true;
        } else {
            for (int j = 1; j < slen; j++) {
                if (old.substr(0, j) == s.substr(slen - j, j)) {
                    chk = true;
                    break;
                }
                if (s.substr(0, j) == old.substr(slen - j, j)) {
                    chk = true;
                    break;
                }
            }
        }

        if (!chk) {
            cout << 0;
            return 0;
        }
        old = s;
    }

    cout << 1;
    return 0;
}
