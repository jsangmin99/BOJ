#include <iostream>
using namespace std;
int main() {
	int A;
	int count=1;
	int range = 1;
	int x = 1;
	cin >> A;


	while (1)
	{
		if (range >= A) {
			break;
		}
		x = 6 * (count++);
		range += x;
	}
	cout << count;
}