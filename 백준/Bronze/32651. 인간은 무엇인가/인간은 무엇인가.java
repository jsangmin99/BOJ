import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n > 100_000) {
            System.out.println("No");
            return;
        }
        System.out.println(n % 2024 == 0 ? "Yes" : "No");
    }
}
