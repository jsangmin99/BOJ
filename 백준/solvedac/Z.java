package solvedac;

import java.io.*;
import java.util.*;

public class Z {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //판의 크기
        int r = Integer.parseInt(st.nextToken()); // 세로
        int c = Integer.parseInt(st.nextToken()); // 가로

        System.out.println(zSearch(n, r, c));

    }

    static int zSearch(int n, int r, int c) {
        if (n == 0) return 0;
        int size = (int) Math.pow(2, n - 1); // 2 ^(n-1)
        int selectionSize = size * size;
        if (r < size && c < size) {
            return zSearch(n - 1, r, c);
        } else if (r < size && c >= size) {
            return selectionSize + zSearch(n - 1, r, c - size);
        } else if (r >= size && c < size) {
            return 2 * selectionSize + zSearch(n - 1, r - size, c);
        } else {
            return 3 * selectionSize + zSearch(n - 1, r - size, c - size);
        }

    }
}
