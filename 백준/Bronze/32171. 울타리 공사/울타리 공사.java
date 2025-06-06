import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int leftX = Integer.MAX_VALUE;
        int leftY = Integer.MAX_VALUE;
        int rightX = Integer.MIN_VALUE;
        int rightY = Integer.MIN_VALUE;

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                if (x <= leftX){
                    leftX = x;
                } else if (x >= rightX) {
                    rightX = x;
                }
                if (y <= leftY) {
                    leftY = y;
                } else if (y >= rightY) {
                    rightY = y;
                }

            }
            int width = rightX - leftX;
            int height = rightY - leftY;

            System.out.println((2 * width) + (2 * height));

        }
    }
}
