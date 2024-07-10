#include <iostream>
using namespace std;
int main() {
    int e, f, c;
    cin >> e >> f >> c;
    int totalBottle = e + f;
    int result = 0;
    while (totalBottle >= c) {
        if (totalBottle % c == 0) {
            totalBottle /= c;
            result += totalBottle;
            continue;
        }

        int temp = totalBottle / c;
        result += temp;
        totalBottle = totalBottle % c + temp;
    }
    cout << result << "\n";

    return 0;
}