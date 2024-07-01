#include <iostream>
#include <string>
using namespace std;
int main() {
    int n, m;
    long sum = 0;

    cin >> n;
    cin >> m;

    for (int i = 0; i < n; i++) {
        long tmp;
        cin >> tmp;
        sum += tmp;
    }
    for (int i = 0; i < m; i++) {
        long tmp;
        cin >> tmp;
        sum += tmp;
    }
	cout << sum;
}