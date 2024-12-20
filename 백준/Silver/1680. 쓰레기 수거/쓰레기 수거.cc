#include <iostream>
using namespace std;

int W, N, cur, ans, x, w;

void solve() {
	cur = ans = 0;
	cin >> W >> N;
	while (N--) {
		cin >> x >> w;
		cur += w;
		if (cur > W) ans += x, cur = w;
		if (cur == W) ans += x, cur = 0;
	}
	if (cur) ans += x;
	cout << ans * 2 << '\n';
}

int T;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cin >> T;
	while (T--) solve();
}