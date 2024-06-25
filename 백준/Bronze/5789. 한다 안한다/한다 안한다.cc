#include<iostream>
using namespace std;
int main(){
	int n;
	cin >> n;
	for(int i = 0 ; i < n; i++){
		string s;
		cin >> s;
		int half = s.size()/2;
		if(s[half] == s[half-1]){
			cout << "Do-it\n";
		}else{
			cout << "Do-it-Not\n";
		}
	}
}