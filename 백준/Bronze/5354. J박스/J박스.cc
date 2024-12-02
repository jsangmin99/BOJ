#include <iostream>
#include <vector>

using namespace std;

int main() {
    int t;
    cin >> t;
    vector<int> sizes(t);

    for (int i = 0; i < t; i++) {
        cin >> sizes[i];
    }

    for (int i = 0; i < t; i++) {
        int n = sizes[i];

        if (n == 1) {
            cout << "#" << endl;
        } else {
            // 첫 번째 줄 출력
            for (int j = 0; j < n; j++) {
                cout << "#";
            }
            cout << endl;

            // 중간 줄 출력
            for (int j = 1; j < n - 1; j++) {
                cout << "#";
                for (int k = 1; k < n - 1; k++) {
                    cout << "J";
                }
                cout << "#";
                cout << endl;
            }

            // 마지막 줄 출력
            for (int j = 0; j < n; j++) {
                cout << "#";
            }
            cout << endl;
        }

        if (i != t - 1) {
            cout << endl; // 각 패턴 사이에 빈 줄 출력
        }
    }

    return 0;
}
