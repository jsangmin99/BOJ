import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String binary = br.readLine();

        int count = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') count++;
        }

        System.out.println(count);
    }
}
