#include <iostream>
#include <string>

using namespace std;

// 함수: 큰 수를 42로 나누어 떨어지는지 확인하는 함수
bool isMultipleOf42(const string& number) {
    int remainder = 0;
    for (char digit : number) {
        remainder = (remainder * 10 + (digit - '0')) % 42;
    }
    return remainder == 0;
}

int main() {
    string number;
    while (true) {
        cin >> number;
        if (number == "0") break;
        if (isMultipleOf42(number)) {
            cout << "PREMIADO" << endl;
        } else {
            cout << "TENTE NOVAMENTE" << endl;
        }
    }
    return 0;
}
