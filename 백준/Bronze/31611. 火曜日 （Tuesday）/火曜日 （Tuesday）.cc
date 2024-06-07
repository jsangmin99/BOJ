#include <iostream>
using namespace std;

int main() {
    //오늘은 일용일 n일 후의 요일 1 : 월,  5 :금  7 : 일
    int a, b;
    cin >> a;

    b = a%7;
    if(b == 2)
        cout << 1;
    else
        cout << 0;
    return 0;
}
