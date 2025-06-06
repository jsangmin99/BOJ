import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static String m;
    static boolean[][] p = new boolean[100][100]; // 수직으로 지나간 위치인지
    static boolean[][] h = new boolean[100][100]; // 수평으로 지나간 위치인지
    static int row = 0, col = 0; // 처음 위치

    // 범위 안에 있는 위치인지 판별
    static boolean isValidLocation(int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 처리
        n = Integer.parseInt(br.readLine());
        m = br.readLine();

        // 각각에 대해 지나간 위치는 배열 p와 배열 h에 true 대입
        for (int i = 0; i < m.length(); i++) {
            char command = m.charAt(i);
            if (command == 'U') {
                if (!isValidLocation(row - 1, col)) continue;

                p[row][col] = true;
                p[--row][col] = true;
            } else if (command == 'D') {
                if (!isValidLocation(row + 1, col)) continue;

                p[row][col] = true;
                p[++row][col] = true;
            } else if (command == 'L') {
                if (!isValidLocation(row, col - 1)) continue;

                h[row][col] = true;
                h[row][--col] = true;
            } else if (command == 'R') {
                if (!isValidLocation(row, col + 1)) continue;

                h[row][col] = true;
                h[row][++col] = true;
            }
        }

        // 결과 출력
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (p[i][j] && h[i][j]) {
                    result.append("+");
                } else if (p[i][j]) {
                    result.append("|");
                } else if (h[i][j]) {
                    result.append("-");
                } else {
                    result.append(".");
                }
            }
            result.append("\n");
        }
        System.out.print(result);
    }
}
