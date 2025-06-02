import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int RED = 0;
    static int GREEN = 1;
    static int BLUE = 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] cost = new int[n][3];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][RED] = Integer.parseInt(st.nextToken());
            cost[i][GREEN] = Integer.parseInt(st.nextToken());
            cost[i][BLUE] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n; i++) {
            cost[i][RED] += Math.min(cost[i - 1][GREEN], cost[i - 1][BLUE]);
            cost[i][GREEN] += Math.min(cost[i - 1][RED], cost[i - 1][BLUE]);
            cost[i][BLUE] += Math.min(cost[i - 1][RED], cost[i - 1][GREEN]);
        }
        System.out.println(Math.min(Math.min(cost[n - 1][RED], cost[n - 1][GREEN]), cost[n - 1][BLUE]));
    }

}
