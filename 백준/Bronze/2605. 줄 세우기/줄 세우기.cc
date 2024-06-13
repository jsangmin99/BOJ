#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> v;
    int n;
    cin >> n;

    for (int i = 1; i <= n; i++) {
        int x;
        cin >> x;
        v.insert(v.begin() + x, i);
    }

    for (int i = n - 1; i >= 0; i--) {  // 역순 출력
        cout << v[i] << " ";
    }
}
