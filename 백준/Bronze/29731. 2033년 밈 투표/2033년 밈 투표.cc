#include<iostream>
#include<string>
using namespace std;

int main(){
    string check[7] = {
        "Never gonna give you up",
        "Never gonna let you down",
        "Never gonna run around and desert you",
        "Never gonna make you cry",
        "Never gonna say goodbye",
        "Never gonna tell a lie and hurt you",
        "Never gonna stop"
    };

    int n;
    string s;
    cin >> n;
    cin.ignore();

    bool found = false;  // 체크 리스트에서 문자열을 찾았는지 여부를 저장하는 변수

    while (n--) {
        getline(cin, s);
        found = false;
        for (int i = 0; i < 7; i++) {
            if (s == check[i]) {
                found = true;
                break;
            }
        }
        if (!found) {
            cout << "Yes" << endl;
            return 0;
        }
    }
    cout << "No" << endl;
    return 0;
}
