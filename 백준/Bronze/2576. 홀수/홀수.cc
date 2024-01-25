#include <algorithm>
#include <iostream>
using namespace std;

int main() {
    int n;
    int sum = 0;
    int min_odd = 100;
    for (int i = 0; i < 7; i++) {
        cin >> n;
        if (n % 2 == 1) {
            sum += n;
            if (min_odd > n) {
                min_odd = n;
            }
        }
    }
    if (min_odd == 100) {
        cout << "-1";
    } else {
        cout << sum << "\n" << min_odd;
    }
}
