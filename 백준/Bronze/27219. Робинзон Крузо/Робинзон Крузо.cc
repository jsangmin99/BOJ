#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    int vCount = n / 5;  // "V"의 개수
    int iCount = n % 5;  // "I"의 개수

    for (int i = 0; i < vCount; ++i) {
        cout << "V";
    }
    for (int i = 0; i < iCount; ++i) {
        cout << "I";
    }
    cout << endl;

    return 0;
}
