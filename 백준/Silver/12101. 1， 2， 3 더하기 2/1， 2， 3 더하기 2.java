import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<String> results = new ArrayList<>();
    static List<Integer> numbers = new ArrayList<>();
    static int sum = 0, n = 0, k = 0, count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        search(new ArrayList<>(), 0);
        System.out.println("-1");

    }

    public static void search(List<Integer> path, int sum) {
        if (sum == n) {
            count++;

            if (k == count) {
                System.out.println(formatResult(path));
                System.exit(0);

            }
            return;
        }
        if (sum > n) {
            return;
        }
        for (int i = 1; i <= 3; i++) {
            path.add(i);
            search(path, sum + i);
            path.remove(path.size() - 1);
        }
    }

    static String formatResult(List<Integer> path) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.size(); i++) {
            if (i > 0) sb.append("+");
            sb.append(path.get(i));
        }
        return sb.toString();
    }

}
