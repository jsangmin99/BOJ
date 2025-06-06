import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        // 순위마다 문제를 푼 번호를 true로 구별
        boolean[] visit = new boolean[13];
        visit[0] = true;
        visit[1] = n == 1 || n == 4 || n == 10 ? true : false;
        visit[2] = true;
        visit[3] = n == 1 ? true : false;
        visit[4] = n != 10 ? true : false;
        visit[5] = true;
        visit[6] = true;
        visit[7] = true;
        visit[8] = n == 2 || n == 3 ? true : false;
        visit[9] = n == 1 ? true : false;
        visit[11] = true;
        visit[12] = true;

        // 총 푼 문제의 개수
        int count = 0;
        for (int i = 0; i < 13; i++) {
            if (visit[i]) {
                count++;
            }
        }

        // 1번 문제는 무조건 다 맞추기 때문에 A를 먼저 삽입
        sb.append(count).append("\nA");

        for (int i = 1; i < 13; i++) {
            if (visit[i]) {
                sb.append(" ").append((char) ('A' + i));
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
