#include <iostream>
using namespace std;

long long countThrees(long long num) {
    long long count = 0;
    long long base = 1;

    while (num > 0) {
        long long last_digit = num % 10;
        if (last_digit < 3) {
            count += (num / 10) * base;
        }
        else if (last_digit == 3) {
            count += (num / 10) * base + (num % base) + 1;
        }
        else {
            count += (num / 10 + 1) * base;
        }

        base *= 10;
        num /= 10;
    }

    return count;
}

int main() {
    long long N;
    cin >> N;

    long long total_count = countThrees(N);

    cout << total_count << endl;

    return 0;
}