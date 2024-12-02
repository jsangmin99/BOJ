#include <iostream>
#include <vector>
using namespace std;
int main() {
    string s;
    int count = 0;
    double sum = 0;

    cin >> s;
    for (char c : s) {
        if (c == 'A') {
            sum += 4.0;
            count++;
        }
        if (c == 'B') {
            sum += 3.0;
            count++;
        }
        if (c == 'C') {
            sum += 2.0;
            count++;
        }
        if (c == 'D') {
            sum += 1.0;
            count++;
        }
        if (c == 'F') {
            sum += 0.0;
            count++;
        }
        if (c == '+') sum += 0.5;
    }
    cout << sum / count << '\n';
    return 0;
}
