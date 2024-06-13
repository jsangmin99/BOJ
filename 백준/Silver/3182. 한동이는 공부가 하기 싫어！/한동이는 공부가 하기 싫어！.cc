#include <iostream>
#include <vector>
#include <cstring>

using namespace std;

vector<int> adj;
vector<bool> visited;
vector<int> depth;

int findDepth(int node) {
    if (visited[node]) return 0; // 이미 방문한 노드면 더 이상 방문하지 않음
    visited[node] = true;
    return 1 + findDepth(adj[node]);
}

int main() {
    int N;
    cin >> N;
    adj.resize(N + 1);
    for (int i = 1; i <= N; ++i) {
        cin >> adj[i];
    }

    int maxDepth = 0;
    int result = 1;

    for (int i = 1; i <= N; ++i) {
        visited.assign(N + 1, false); // 각 노드에서 시작할 때마다 visited 초기화
        int currentDepth = findDepth(i);
        if (currentDepth > maxDepth) {
            maxDepth = currentDepth;
            result = i;
        }
    }

    cout << result << endl;
    return 0;
}
