import java.io.*;
import java.util.*;

public class Solution {
    static int[] dx = { -1, 1, 0, 0 }; // 상하좌우
    static int[] dy = { 0, 0, -1, 1 };
    static int n;
    static int[][] board;
    static Map<Integer, List<int[]>> wormholes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringTokenizer st;
        for (int tc = 0; tc < T; tc++) {
            n = Integer.parseInt(br.readLine().trim());
            board = new int[n][n];
            wormholes = new HashMap<>();
            int maxScore = 0;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine().trim());
                for (int k = 0; k < n; k++) {
                    board[j][k] = Integer.parseInt(st.nextToken());
                    if (board[j][k] >= 6 && board[j][k] <= 10) {
                        wormholes.putIfAbsent(board[j][k], new ArrayList<>());
                        wormholes.get(board[j][k]).add(new int[] { j, k });
                    }
                }
            }
            // -1 = 블랙홀
            // 0 = 빈공간
            // 1~5 = 블록
            // 1 = ㄴ, 2 = 좌우반전 ㄱ, 3 = ㄱ, 5 좌우반전 ㄴ, 5 = ㅁ
            // 6 ~10 = 웜홀

            // 출발위치로 돌아오거나 블랙홀에 빠지면 종료

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 0) { // 빈공간일때 시작 가능
                        for (int dir = 0; dir < 4; dir++) {
                            maxScore = Math.max(maxScore, simulate(i, j, dir));
                        }

                    }
                }
            }
            System.out.println("#" + (tc + 1) + " " + maxScore);

        }

    }

static int simulate(int sx, int sy, int dir) {
    int x = sx, y = sy, d = dir;
    int score = 0;

    while (true) {
        x += dx[d];
        y += dy[d];

        if (x < 0 || x >= n || y < 0 || y >= n) {
            d = reflectWall(d);
            score++;
            continue;
        }

        int val = board[x][y];

        if ((x == sx && y == sy) || val == -1)
            break;

        if (val == 0)
            continue;

        if (val >= 1 && val <= 5) {
            d = reflectBlock(val, d);
            score++;
        } else if (val >= 6 && val <= 10) {
            List<int[]> pair = wormholes.get(val);
            if (pair == null || pair.size() != 2) return score;

            for (int[] wh : pair) {
                if (wh[0] != x || wh[1] != y) {
                    x = wh[0];
                    y = wh[1];
                    break;
                }
            }
            continue;
        }
    }

    return score;
}


    private static int reflectWall(int d) {
        if (d == 0)
            return 1;
        if (d == 1)
            return 0;
        if (d == 2)
            return 3;
        return 2;
    }

    private static int reflectBlock(int type, int d) {
        switch (type) {
            case 1:
                if (d == 0)
                    return 1;
                if (d == 1)
                    return 3;
                if (d == 2)
                    return 0;
                return 2;
            case 2:
                if (d == 0)
                    return 3;
                if (d == 1)
                    return 0;
                if (d == 2)
                    return 1;
                return 2;
            case 3:
                if (d == 0)
                    return 2;
                if (d == 1)
                    return 0;
                if (d == 2)
                    return 3;
                return 1;
            case 4:
                if (d == 0)
                    return 1;
                if (d == 1)
                    return 2;
                if (d == 2)
                    return 3;
                return 0;
            case 5:
            default:
                return reflectWall(d);
        }
    }

}
