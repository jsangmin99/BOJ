#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

void sol() {
	int n, m;
	cin >> n >> m;
	vector<int> A(n);
	vector<int> B(m);
	vector<int> answer;

	for (int i = 0; i < n; i++)
		cin >> A[i];
	for (int i = 0; i < m; i++)
		cin >> B[i];

	sort(B.begin(), B.end());
	sort(A.begin(), A.end());

	for (int i = 0; i < n; i++) {
		int lt = 0;
		int rt = m - 1;
		bool isFind = false;
		while (lt <= rt) {
			int mid = (lt + rt) / 2;

			if (B[mid] == A[i]) {
				isFind = true;
				break;
			}
			else if (B[mid] > A[i]) {
				rt = mid - 1;
			}
			else {
				lt = mid + 1;
			}
		}

		if (!isFind)
			answer.push_back(A[i]);
	}

	cout << answer.size() << '\n';
	for (int a : answer)
		cout << a << ' ';
}

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);
	sol();
}