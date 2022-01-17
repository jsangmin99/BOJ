#include <iostream>
#include <string>
using namespace std;

int main() {
	
	int count;
	int result = 0;
	string a;

	cin >> count;

	for (int i = 0; i < count; i++) {
		cin >> a;
		bool alpa[26] = { false, };

		alpa[(int)(a[0]) - 97] = true;

		for (int i = 1; i < a.length(); i++) {

			if (a[i] == a[i - 1]) {
				continue;
			}
			else if (a[i] != a[i - 1] && alpa[(int)(a[i]) - 97] == true) {
				result++;
				break;
			}
			else {
				alpa[(int)(a[i]) - 97] = true;
			}
		}
	}
	cout << count - result;
}