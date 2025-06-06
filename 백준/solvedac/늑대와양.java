package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 늑대와양 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] dimensions = br.readLine().split(" ");
        int R = Integer.parseInt(dimensions[0]);
        int C = Integer.parseInt(dimensions[1]);

        char[][] farm = new char[R][C];

        for (int i = 0; i < R; i++) {
            farm[i] = br.readLine().toCharArray();
        }

        boolean possible = true;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (farm[i][j] == 'W') { // 늑대일 때만 탐색
                    int[] dx = {-1, 1, 0, 0};
                    int[] dy = {0, 0, -1, 1};

                    for (int d = 0; d < 4; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];

                        if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                            if (farm[nx][ny] == 'S') { // 늑대가 양과 인접
                                possible = false;
                                break;
                            } else if (farm[nx][ny] == '.') { // 빈 칸에 울타리 설치
                                farm[nx][ny] = 'D';
                            }
                        }
                    }
                }
                if (!possible) break;
            }
            if (!possible) break;
        }

        if (possible) {
            System.out.println(1);
            for (int i = 0; i < R; i++) {
                System.out.println(new String(farm[i]));
            }
        } else {
            System.out.println(0);
        }
    }
}
