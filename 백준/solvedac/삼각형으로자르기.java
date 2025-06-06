import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 삼각형으로자르기 {
    static class Point {
        double x, y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    static double triangleArea(Point a, Point b, Point c) {
        return Math.abs(
                a.x * (b.y - c.y) +
                b.x * (c.y - a.y) +
                c.x * (a.y - b.y))
                / 2.0;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Point[] points = new Point[n];
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            points[i] = new Point(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
        }

        double maxArea = 0;
        for (int a = 0; a < n - 2; a++) {
            for (int b = a + 1; b < n - 1; b++) {
                for (int c = b + 1; c < n; c++) {
                    maxArea = Math.max(maxArea, triangleArea(points[a], points[b], points[c]));
                }
            }
        }

        System.out.printf("%.1f\n", maxArea);

    }

}
