#include <iostream>
#include <string>
using namespace std;

int main() {
    int T;
    cin >> T;
    for (int i = 0; i < T; i++) {
        int N, M;
        cin >> N >> M;
        if (N < M) {
            swap(N, M); 
        }
        // (n-m)! / m!
        long long result = 1;

        for (int i = 0; i < M; i++) {
            result *= (N - i);      
            result /= (i + 1);     
        }
        cout << result << "\n";
    }
}
