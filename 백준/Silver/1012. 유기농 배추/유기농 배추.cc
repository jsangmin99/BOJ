#include <iostream>
#include <algorithm>
using namespace std;

int t, m, n, k, x, y, ans;
int map[50][50];
int dx[4] = {0, 0, -1, 1}; // 상하좌우
int dy[4] = {1, -1, 0, 0};

void dfs(int x, int y) {
	map[x][y] = 0;
	for (int i = 0; i < 4; i++) {
		int nx = x + dx[i];
		int ny = y + dy[i];
		if (nx < 0 || ny < 0 || nx >= m || ny >= n)
            continue;
		if (map[nx][ny] == 1) {
			dfs(nx, ny);
		}
	}
}

int main() {
	cin >> t;
	for (int q = 0; q < t; q++) {
		cin >> m >> n >> k;
		for (int i = 0; i < k; i++) {
			cin >> x >> y;
			map[x][y] = 1;
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1) {
					dfs(i, j);
					ans++;
				}
			}
		}

		cout << ans << '\n';
		ans = 0;
		for (int i = 0; i < m; i++) {
			fill(map[i], map[i] + n, 0); // 0으로 초기화
		}
	}
}