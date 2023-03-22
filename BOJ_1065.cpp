//한수
#include <iostream>
using namespace std;
int one, ten, hund;

bool check(int n) {
	one = n % 10;
	ten = n / 10 % 10;
	hund = n / 100;

	int dif1, dif2;
	dif1 = hund - ten;
	dif2 = ten - one;

	if (n < 100 || dif1 == dif2) {
		return true;
	}
	else return false;
}
int main() {
	int n, cnt=0;
	cin >> n;

	for (int i = 1; i <= n; i++) {
		if (check(i) == true) {
			cnt += 1;
		}
	}
	cout << cnt;
	

}