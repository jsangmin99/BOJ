#include <iostream>
#include <cmath>
using namespace std;
int main() {
	int t;
	long long x, y;

	cin >> t;

	for (int i = 0; i < t;i++) {
		cin >> x >> y;
		double move = y-x;
		double sqrtmov = sqrt(move);
		int half = round(sqrtmov);

		if (sqrtmov <= half)
			cout << half * 2 - 1 << "\n";
		else
			cout << half * 2 << "\n";
		
	}
	return 0;
}