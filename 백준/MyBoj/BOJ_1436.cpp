#include <iostream>
#include <string>
using namespace std;
 
int main()
{
	int n;
	int count = 0;
	int title = 665;
	string name;
 
	cin >> n;
 
	while(++title){
		name = to_string(title);
 
		if (name.find("666") != -1) {
			++count;
		}
 
		if (count == n) {
			cout << title << endl;
			break;
		}
	}
}