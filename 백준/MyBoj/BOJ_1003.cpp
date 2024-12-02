#include <iostream>
using namespace std;

long long arr[41] ={0,1, };
long long fibonacci(int n) {
	if (n == 0|| n==1) 
		return arr[n];
	else if(arr[n] == 0)
        arr[n] = fibonacci(n-1) + fibonacci(n-2);
    return arr[n];
} 

int main() {
	int T;
	cin >> T;
	int num;
	for (int i = 0; i < T; i++) {
		cin >> num;
	if(num==0)
		cout << "1 0"<<"\n";
	else
		cout << fibonacci(num-1) << " " << fibonacci(num)<< "\n";
	}
}