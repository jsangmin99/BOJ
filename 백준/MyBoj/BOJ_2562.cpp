#include <iostream>
#include<algorithm>
using namespace std;

int main() {
	int n;
	int max=-1;
	int arr[9];
	int index;

	for (int i = 0; i < 9; i++) {
		cin >> n;
		if (n > max) {
			max = n;
			index = i;

		}
	}
	
	cout << max<<"\n";
	cout << index+1;



}