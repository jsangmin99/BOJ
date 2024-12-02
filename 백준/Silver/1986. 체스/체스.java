import java.util.*;

public class Main {
    static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n][m];

        // 초기화
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], 0);
        }

        int Q = sc.nextInt();
        input(sc, Q, 'Q', n, m);

        int K = sc.nextInt();
        input(sc, K, 'K', n, m);

        int P = sc.nextInt();
        input(sc, P, 'P', n, m);


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    qdfs(i, j);
                } else if (arr[i][j] == 2) {
                    kdfs(i, j);
//                } else if (arr[i][j] == 3) {
//                    pdfs(i, j);
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    public static void qdfs(int x, int y) {
        int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
        int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            while (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                if (arr[nx][ny] == 0) {
                    arr[nx][ny] = 4;
                } else if (arr[nx][ny] == 1 || arr[nx][ny] == 2 || arr[nx][ny] == 3) {
                    break;
                }
                nx += dx[i];
                ny += dy[i];
            }
        }
    }

    public static void kdfs(int x, int y) {
        int[] dx = {2, 2, -2, -2, 1, -1, 1, -1};
        int[] dy = {1, -1, 1, -1, 2, 2, -2, -2};
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
                if (arr[nx][ny] == 0) {
                    arr[nx][ny] = 4;
                }
            }
        }
    }

//    public static void pdfs(int x, int y) {
//        int[] dx = {1, 1};
//        int[] dy = {0, 1};
//        for (int i = 0; i < 2; i++) {
//            int nx = x + dx[i];
//            int ny = y + dy[i];
//            if (nx >= 0 && ny >= 0 && nx < arr.length && ny < arr[0].length) {
//                if (arr[nx][ny] == 0) {
//                    arr[nx][ny] = 4;
//                }
//            }
//        }
//    }

    static void input(Scanner sc, int T, char type, int n, int m) {
        for (int i = 0; i < T; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if (type == 'Q') {
                arr[x][y] = 1;
            } else if (type == 'K') {
                arr[x][y] = 2;
            } else if (type == 'P') {
                arr[x][y] = 3;
            }
        }
    }
}
