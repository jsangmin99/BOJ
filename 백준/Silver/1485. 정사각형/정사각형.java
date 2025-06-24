import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int cal(Point a, Point b) {
        int dx = a.x - b.x;
        int dy = a.y - b.y;
        return dx * dx + dy * dy;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            Point[] points = new Point[4];
            for (int j = 0; j < 4; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                points[j] = new Point(x, y);
            }

            List<Integer> dists = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    dists.add(cal(points[j], points[k]));
                }
            }

            Collections.sort(dists);
            if (dists.get(0) > 0 && // 같은 점 아님
                    dists.get(0).equals(dists.get(1)) &&
                    dists.get(1).equals(dists.get(2)) &&
                    dists.get(2).equals(dists.get(3)) &&
                    dists.get(4).equals(dists.get(5))) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }

    }

}
