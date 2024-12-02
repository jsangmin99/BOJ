#include <iostream>

using namespace std;

int main() {
    int h, w, n, m, max = 0;
    int arr[50][50];
    cin >> h >> w;
    for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
            cin >> arr[i][j];
        }
    }

    cin >> n >> m;

    for (int i = 0; i < h - n; i++) {
        for (int j = 0; j < w - m; j++) {
            int sum = 0;
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < m; l++) {
                    sum += arr[i + k][j + l];
                }
            }
            if (max < sum) max = sum;
        }
    }
    cout << max;

    return 0;
}