import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] map = new char[n][n];
        int minRow = n;
        int maxRow = -1;
        int minCol = n;
        int maxCol = -1;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'G') {
                    minRow = Math.min(minRow, i);
                    minCol = Math.min(minCol, j);
                    maxRow = Math.max(maxRow, i);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        if (minRow == maxRow && minCol == maxCol) {
            System.out.println(0);
        }else if (minRow == maxRow) {
            System.out.println(Math.min(maxCol, n- minCol -1));
        }else if (minCol == maxCol) {
            System.out.println(Math.min(maxRow, n - minRow-1));
        }else{
            int rowMove = Math.min(maxRow,n - minRow -1);
            int colMove = Math.min(maxCol, n-minCol-1);
            System.out.println(rowMove + colMove);
        }

    }

}
