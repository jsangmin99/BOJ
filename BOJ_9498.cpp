#include <iostream>
using namespace std;
int main() {
	int A;

	cin >> A;

	if (100 >= A and A >= 90) {
		cout << "A" << endl;
	}
	else if (89 >= A and A >= 80) {
		cout << "B" << endl;
	}
	else if (79 >= A and A >= 70) {
		cout << "C" << endl;
	}
	else if (69 >= A and A >= 60) {
		cout << "D" << endl;
	}
	else {
		cout << "F" << endl;
	}
}