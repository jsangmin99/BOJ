#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> primes;
    vector<bool> is_prime(n + 1, true);

    // 에라토스테네스의 체를 사용하여 n까지의 모든 소수를 찾기
    for (int i = 2; i * i <= n; i++) {
        if (!is_prime[i]) continue;
        for (int j = i * 2; j <= n; j += i) {
            is_prime[j] = false;
        }
    }

    // n까지의 소수를 primes 벡터에 저장
    for (int i = 2; i <= n; i++) {
        if (is_prime[i]) primes.push_back(i);
    }

    int count = 0;
    // 투 포인터를 사용하여 연속된 소수의 합으로 n을 찾기
    for (int start = 0; start < primes.size(); start++) {
        int current_sum = 0;
        for (int end = start; end < primes.size(); end++) {
            current_sum += primes[end];
            if (current_sum == n) {
                count++;
                break;
            } else if (current_sum > n) {
                break;
            }
        }
    }

    cout << count;

    return 0;
}
