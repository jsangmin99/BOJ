#include <iostream>
using namespace std;

int main() {
    int T, n;
    cin >> T;
    int arr[20];  // 이진수 저장

    for (int i = 0; i < T; i++) {
        cin >> n;
        int k = 0;
        while (1) {
            if (n % 2 == 0) {
                arr[k] = 0;
            } else
                arr[k] = 1;
            n /= 2;
            k++;
            if (n == 1 || n == 0) {
                arr[k] = n;
                break;
            }
        }
        for (int j = 0; j < k + 1; j++) {
            if (arr[j] == 1) {
                cout << j << " ";
            }
        }
        cout << endl;
    }

    return 0;
}