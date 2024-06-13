#include <iostream>
using namespace std;

int main() {
    int arr[4];
    bool flag = false;
    for (int i = 0; i < 4; i++) {
        cin >> arr[i];
    }
    int x, y, r;
    cin >> x >> y >> r;

    for (int i = 0; i < 4; i++) {
        if (arr[i] == x) {
            cout << i + 1;
            flag = true;
            break;
        }
    }
    if(flag == false) {
        cout << 0;
    }
}
