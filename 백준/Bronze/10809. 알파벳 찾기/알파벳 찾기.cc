#include <iostream>
#include <string>
using namespace std;

int main() {
	string s;
	string english = "abcdefghijklmnopqrstuvwxyz";

	
	cin >>s;
	for (int i = 0; i < english.length(); i++) {
		cout << (int)s.find(english[i]) << " ";
	}
}