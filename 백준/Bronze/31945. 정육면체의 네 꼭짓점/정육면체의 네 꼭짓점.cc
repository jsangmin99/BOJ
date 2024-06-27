#include <iostream>
#include <vector>
#include <set>
using namespace std;

// 미리 정의된 정육면체의 각 면을 구성하는 꼭짓점들
const vector<set<int>> faces = {
    {0, 2, 4, 6},  // z = 0
    {1, 3, 5, 7},  // z = 1
    {0, 1, 4, 5},  // y = 0
    {2, 3, 6, 7},  // y = 1
    {0, 1, 2, 3},  // x = 0
    {4, 5, 6, 7}   // x = 1
};

bool check_face(const set<int>& points) {
    for (const auto& face : faces) {
        if (points == face) {
            return true;
        }
    }
    return false;
}

int main() {
    int T;
    cin >> T;
    while (T--) {
        int a, b, c, d;
        cin >> a >> b >> c >> d;
        set<int> points = {a, b, c, d};
        if (check_face(points)) {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
    }
    return 0;
}
