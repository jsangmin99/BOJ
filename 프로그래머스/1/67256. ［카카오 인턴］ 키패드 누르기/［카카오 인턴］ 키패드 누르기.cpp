#include <string>
#include <vector>
#include <cmath>

using namespace std;

// 두 지점 간의 거리를 계산하는 함수
int calculateDistance(int x1, int y1, int x2, int y2) {
    return abs(x1 - x2) + abs(y1 - y2);
}

string solution(vector<int> numbers, string hand) {
    string answer = "";
    int leftX = 0, leftY = 3;   // 왼손 초기(*)
    int rightX = 2, rightY = 3; // 오른손 초기(#)

    for (int number : numbers) {
        int x, y; // 현재 숫자의 위치
        if (number == 0) { // 숫자 0의 경우 좌표를 따로 처리
            x = 1;
            y = 3;
        } else {
            x = (number - 1) % 3; // 키패드의 가로 위치
            y = (number - 1) / 3; // 키패드의 세로 위치
        }

        if (number == 1 || number == 4 || number == 7) { // 왼쪽 열 숫자
            answer += "L";
            leftX = x;
            leftY = y;
        } else if (number == 3 || number == 6 || number == 9) { // 오른쪽 열 숫자
            answer += "R";
            rightX = x;
            rightY = y;
        } else { // 가운데 열 숫자
            int leftDistance = calculateDistance(leftX, leftY, x, y);
            int rightDistance = calculateDistance(rightX, rightY, x, y);
            if (leftDistance < rightDistance || (leftDistance == rightDistance && hand == "left")) {
                answer += "L";
                leftX = x;
                leftY = y;
            } else {
                answer += "R";
                rightX = x;
                rightY = y;
            }
        }
    }

    return answer;
}
