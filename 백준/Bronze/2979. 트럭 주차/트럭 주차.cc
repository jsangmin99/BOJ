#include <iostream>
#include <vector>
using namespace std;
int main() {
    int a, b, c;
    int total = 0;
    cin >> a >> b >> c;
    vector<int> arr(101, 0);
    for (int i = 0; i < 3; i++) {
        int start, end;
        cin >> start >> end;
        for (int j = start; j < end; j++) {
            arr[j]++;
        }
    }
    for (int i = 0; i < 101; i++) {
        if (arr[i] == 1) {
            total += (a * arr[i]);
        } else if (arr[i] == 2) {
            total += (b * arr[i]);
        } else if (arr[i] == 3) {
            total += (c * arr[i]);
        }
    }
    cout << total << "\n";
    return 0;
}
