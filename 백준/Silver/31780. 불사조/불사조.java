import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);

        for (int i = 0; i < m; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int power = queue.poll();
                result += power;
                int left = power / 2;
                int right = (power + 1) / 2;
                queue.add(left);
                queue.add(right);
            }
        }

        for (int p : queue) {
            result += p;
        }
        System.out.println(result);

    }

}
