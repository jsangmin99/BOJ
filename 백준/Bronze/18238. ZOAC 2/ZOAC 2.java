import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solved(br.readLine()));
    }

    private static int solved(String input) {
        int totalTime = 0;
        char current = 'A';
        for (int i = 0; i < input.length(); i++) {
            char target = input.charAt(i);
            int diff = Math.abs(target - current);
            totalTime += Math.min(diff, 26 - diff);
            current = target;
        }
        return totalTime;
    }

}
