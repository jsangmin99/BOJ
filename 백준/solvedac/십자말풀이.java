import java.io.*;
import java.util.*;

public class 십자말풀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        Set<String> hints = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (arr[i][j] == '.') {
                    // 가로
                    if ((j == 0 || arr[i][j - 1] == '#') &&
                            (j + 2 < m && arr[i][j + 1] == '.' && arr[i][j + 2] == '.')) {
                        hints.add((i + 1) + " " + (j + 1));
                    }
                    // 세로
                    if ((i == 0 || arr[i - 1][j] == '#') &&
                            (i + 2 < n && arr[i + 1][j] == '.' && arr[i + 2][j] == '.')) {
                        hints.add((i + 1) + " " + (j + 1));
                    }
                }
            }
        }

        System.out.println(hints.size());
        for(String hint : hints){
            System.out.println(hint);
        }
    }

}
