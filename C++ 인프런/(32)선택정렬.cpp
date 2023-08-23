#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
int main(){
	int n =0,m=0;
	cin >> n;
	vector<int> arr;
	for(int i =0; i < n; i++){
		cin >>m;
		arr.push_back(m);
	}
	sort(arr.begin(), arr.end());
	for (int i = 0; i < arr.size(); i++) {
        cout << arr[i] << " ";
    }

}
