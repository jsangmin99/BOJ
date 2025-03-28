#include <iostream>
#include <queue>
using namespace std;

int main() {
    queue<int> q;
    int n, k;
    cin >> n >> k;
    for (int i = 1; i <= n; i++) {
        q.push(i);
    }
    cout << "<";
    while (q.size() > 1) {
        for (int i = 1; i < k; i++) {
            int temp = q.front();
            q.pop();
            q.push(temp);
        }
        cout << q.front() << ", ";
        q.pop();
    }
    cout << q.front() << ">\n";
}