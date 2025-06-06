package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 하키 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken()); // 가로
        int H = Integer.parseInt(st.nextToken()); // 세로
        int X = Integer.parseInt(st.nextToken()); // 절댓값이 100 보다 작거나 같은 정수
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken()); // 선수의 수 최대 50

        int R = H / 2; // 반지름
//        원의 왼쪽 중심 은 (X, Y + R)
//        원의 오른쪽 중심은 (X + W , Y + R)

        int result = 0;

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 1. 선수의 x좌표가 직사각형의 왼쪽 영역인 경우: 왼쪽 원 내부 판별
            if (x < X) {
                int dx = x - X;            // 왼쪽 원 중심의 x좌표는 X
                int dy = y - (Y + R);        // 왼쪽 원 중심의 y좌표는 Y+R
                if (dx * dx + dy * dy <= R * R) {
                    result++;
                }
            }
            // 2. 선수의 x좌표가 직사각형의 오른쪽 영역인 경우: 오른쪽 원 내부 판별
            else if (x > X + W) {
                int dx = x - (X + W);        // 오른쪽 원 중심의 x좌표는 X+W
                int dy = y - (Y + R);        // 오른쪽 원 중심의 y좌표는 Y+R
                if (dx * dx + dy * dy <= R * R) {
                    result++;
                }
            }
            // 3. 선수의 x좌표가 직사각형 영역 내에 있을 경우: 단순히 직사각형 내부 여부 판별
            else {
                if (y >= Y && y <= Y + H) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
