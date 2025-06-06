import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int startH = Integer.parseInt(st.nextToken());
            int startM = Integer.parseInt(st.nextToken());
            int startS = Integer.parseInt(st.nextToken());
            int endH = Integer.parseInt(st.nextToken());
            int endM = Integer.parseInt(st.nextToken());
            int endS = Integer.parseInt(st.nextToken());

            int startSecond = timeToSecond(startH, startM, startS);
            int endSecond = timeToSecond(endH, endM, endS);

            int workSecond = endSecond - startSecond;
            int[] time = secondToTime(workSecond);

            System.out.println(time[0] + " " + time[1] + " " + time[2]);

        }

    }

    private static int timeToSecond(int h, int m, int s) {
        return h * 3600 + m * 60 + s;
    }

    private static int[] secondToTime(int seconds) {
        int h = seconds / 3600;
        int m = (seconds % 3600) / 60;
        int s = seconds % 60;
        return new int[] { h, m, s };
    }

}
