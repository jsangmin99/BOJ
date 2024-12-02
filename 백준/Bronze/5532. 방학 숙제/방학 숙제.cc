#include <iostream>
#include <string>
using namespace std;
int main() {
    int L, A, B ,C, D;
    cin >> L >> A >> B >> C >> D;
    int Atmp = 0;
    if (A % C > 0) {
        Atmp = A / C + 1;
    } else {
        Atmp = A / C;
    }

	int Btmp =0;
    if (B % D > 0) {
        Btmp = B / D + 1;
    } else {
        Btmp = B / D;
    }
	int result = max(Atmp,Btmp);
	cout << L-result;
}