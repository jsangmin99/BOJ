#include <string>
#include <vector>

using namespace std;

int solution(string s) {
 int answer = s.length(); // 최대 길이로 초기화

    // 가장 짧아지도록 압축할수 있는 방법은 반반일 경우 이므로 나누기 2
    for (int i = 1; i <= s.length() / 2; i++) {
        int count = 1; // 단위의 개수
        int length = 0; // 압축된 문자열의 길이 2a2b1a3c

        // 뭉탱이부터 시작하여 문자열 끝까지 탐색
        for (int j = i; j <= s.length() - i; j += i) {
            // 이전 부분 문자열과 현재 부분 문자열이 같으면 count 증가
            if (s.substr(j - i, i) == s.substr(j, i)) { 
                count++;
            } else { // 다르면 압축 결과에 추가
                if (count > 1) {
                    length += to_string(count).length();
                }
                length += i;
                count = 1; // count 초기화
            }
        }

        // 마지막 부분 문자열 처리
        if (count > 1) {
            length += to_string(count).length();
        }
        length += i;
        length += s.length() % i;

        // 압축된 문자열의 길이가 현재까지의 최소 길이보다 작으면 업데이트
        if (length < answer) {
            answer = length;
        }
    }

    return answer;
}