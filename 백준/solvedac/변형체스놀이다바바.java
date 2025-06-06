package solvedac;

import java.io.*;
import java.util.*;

public class 변형체스놀이다바바 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 체스판 크기
        int K = Integer.parseInt(st.nextToken()); // 다바바 개수
        int count = 0;


        Set<String> occupied = new HashSet<>(); // 다바바 리스트
        List<int[]> dabbabas = new ArrayList<>(); // 다바바의 위치

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            dabbabas.add(new int[]{x, y});
            occupied.add(x + "," + y);
        }

        int[][] moves = {{2, 0}, {-2, 0}, {0, 2}, {0, -2}}; // 다바바 이동 가능 방향
        Set<String> reachable = new HashSet<>();

        for (int[] dabbaba : dabbabas) {
            int x = dabbaba[0];
            int y = dabbaba[1];

            for (int[] move : moves) {
                int nx = x + move[0];
                int ny = y + move[1];

                if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && !occupied.contains(nx + "," + ny)) {
                    reachable.add(nx + "," + ny);
                }
            }
        }

        System.out.println(reachable.size());
    }
}
