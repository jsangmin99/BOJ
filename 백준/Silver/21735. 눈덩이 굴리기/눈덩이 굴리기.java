import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int minutes;
    static int max = -1;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        minutes = Integer.parseInt(st.nextToken());
        arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0, 1);
        System.out.println(max);
    }

    static void dfs(int nowLocation, int time, int nowSize) {
//        종료 조건 : 시간초과 이거나 마지막 위치 도달
        if (time == minutes || nowLocation >= N) {
            max = Math.max(max, nowSize);
            return;
        }

//        1. 눈덩이를 굴리는경우 +1 위치 더하기
        if (nowLocation + 1 <= N) {
            dfs(nowLocation + 1, time + 1, nowSize + arr[nowLocation + 1]);
        }

//        2. 눈덩이를 던지는 경우 /2 후 +2 위치
        if (nowLocation + 2 <= N) {
            dfs(nowLocation + 2, time + 1, (nowSize / 2) + arr[nowLocation + 2]);
        }


    }
}
