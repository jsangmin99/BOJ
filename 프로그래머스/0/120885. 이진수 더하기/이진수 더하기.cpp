#include <string>
#include <vector>
#include<bitset>

using namespace std;

string solution(string bin1, string bin2) {
   string result = "";

    int carry = 0;
    int len1 = bin1.length();
    int len2 = bin2.length();
    int maxLength = max(len1, len2);

    for (int i = 0; i < maxLength; ++i) {
        int digit1 = (i < len1) ? bin1[len1 - 1 - i] - '0' : 0;
        int digit2 = (i < len2) ? bin2[len2 - 1 - i] - '0' : 0;

        int sum = digit1 + digit2 + carry;

        result = to_string(sum % 2) + result;

        carry = sum / 2;
    }

    if (carry)
        result = "1" + result;

    return result;
}