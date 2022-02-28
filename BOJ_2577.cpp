#include <iostream>
#include<algorithm>
#include<string>
#include <vector>

using namespace std;

int main() {
	int a, b, c,x;
	int AR[10] = {};

	cin >> a >> b >> c;
	x = a * b * c;

	string y = to_string(x);

	for (char ch:y) {
		AR[ch-'0']++;
	}
	
		for (int v : AR) {
			cout << v << "\n";
	}

}