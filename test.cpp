#include <iostream>
#include <vector>
#include <queue>
#include <unordered_set>
using namespace std;

int main() {
    int N, M, A, B;
    cin >> N >> M >> A >> B;

    // 제약 구간을 입력받아 집합으로 저장
    unordered_set<int> forbidden;
    for (int i = 0; i < M; ++i) {
        int L, R;
        cin >> L >> R;
        for (int j = L; j <= R; ++j) {
            forbidden.insert(j);
        }
    }

    // BFS를 위한 큐와 방문 여부를 체크할 배열
    queue<pair<int, int>> q; // (현재 강아지 수, 현재까지의 행동 횟수)
    vector<bool> visited(N + 1, false);
    q.push({0, 0});
    visited[0] = true;

    while (!q.empty()) {
        auto [dogs, actions] = q.front();
        q.pop();

        // 두 가지 마법을 사용하여 다음 상태로 이동
        for (int new_dogs : {dogs + A, dogs + B}) {
            if (new_dogs == N) {
                cout << actions + 1 << endl; // 목표에 도달했으면 현재 행동 횟수 + 1
                return 0;
            }
            if (new_dogs < N && forbidden.find(new_dogs) == forbidden.end() && !visited[new_dogs]) {
                visited[new_dogs] = true;
                q.push({new_dogs, actions + 1});
            }
        }
    }

    // 목표에 도달할 수 없는 경우
    cout << -1 << "\n";
    return 0;
}
