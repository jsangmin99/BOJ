package solvedac;

import java.io.BufferedReader;
import java.util.Scanner;

public class N과M2 {
    static int N;
    static int M;
    static int[] result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        result = new int[M];
        dfs(1, 0);
    }

    static void dfs(int start, int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {
            result[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}
