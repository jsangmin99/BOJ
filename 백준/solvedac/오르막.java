import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 오르막 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int prev = Integer.MIN_VALUE;
        boolean isGood = true;

        while (st.hasMoreTokens()) {
            int current = Integer.parseInt(st.nextToken());
            if (current < prev) {
                isGood = false;
                break;
            }
            prev = current;
        }
        if (isGood) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }

}
