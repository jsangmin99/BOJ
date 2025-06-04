#include <iostream>
#include <string>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int t; // 동작 구분 (1: 숫자 → 문자열, 2: 문자열 → 숫자)
    cin >> t;

    if (t == 1) { 
        // Step 1: 두 정수를 입력받아 문자열로 변환
        long long int a, b;
        cin >> a >> b;
        long long int k = a + b;

        string s = "aaaaaaaaaaaaa"; // 13자리 문자열 초기화
        for (int i = 0; i < s.size(); i++) {
            if (k) {
                s[i] = (k % 26) + 'a'; // 26진법에 따라 문자로 변환
                k /= 26;
            } else {
                break;
            }
        }
        cout << s << '\n';
    } 
    else { 
        // Step 2: 문자열을 입력받아 숫자로 변환
        string s;
        cin >> s;
        long long int ans = 0, r = 1;

        for (int i = 0; i < s.size(); i++) {
            ans += (s[i] - 'a') * r; // 각 문자를 숫자로 변환
            r *= 26; // 26진법 자릿수 처리
        }
        cout << ans << '\n';
    }

    return 0;
}