#include <iostream>
using namespace std;
int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int x, y, i = 0;
	cin >> x;
	y = x;

	do {
		y = (y % 10) * 10 + ((y / 10) + (y % 10)) % 10;
		i++;
	}

	while (x != y);
	cout << i;
}