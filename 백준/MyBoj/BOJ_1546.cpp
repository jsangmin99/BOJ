#include <iostream>
using namespace std;
int main() {
	int n,a = 0;
	double sum = 0;
	int max=0;
	cin >> n;

	for (int i = 0; i < n;i++) {
		cin >> a;
		sum +=a;
		if (max < a) {
			max = a;
		}
	}
	sum = (sum / max * 100) / n;
	cout.precision(9);
	cout << sum << "\n";
}