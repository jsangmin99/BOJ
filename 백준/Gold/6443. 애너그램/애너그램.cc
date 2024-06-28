#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
string str;
int len;

void dfs(string s, int idx) {
	if (idx == len - 1) {
		cout << s << '\n';
		return;
	}
	for (int i = idx; i < len; i++) {
		if (i != idx && s[i] == s[idx])
			continue;
		if(s[i] != s[idx]){
			char c = s[i];
			s[i] = s[idx];
			s[idx] = c;
		}
		dfs(s, idx + 1);
	}
}

int main() {
	int n;
	cin >> n;
	while (n) {
		cin >> str;
		len = str.size();
		sort(str.begin(), str.end());
		dfs(str, 0);
		n--;
	}
	return 0;
}
