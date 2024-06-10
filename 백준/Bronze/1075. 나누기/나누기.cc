#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int arr[2000];

int main(){
    int n, f, ans;
    cin >> n >> f;
    n -= n % 100;
    for (int i = 0; i < 100; i++) {
        if ((n + i) % f == 0) {
            ans = i;
            break;
        }
    }
    if (ans < 10)
        cout << 0;
    cout << ans << '\n';
    return 0;
}
