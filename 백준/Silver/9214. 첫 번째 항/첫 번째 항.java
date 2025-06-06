import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseN = 1;

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) break;
            while (true) {
                StringBuilder sb = new StringBuilder();

                if (input.length() % 2 == 1) break;

                for (int i = 0; i < input.length(); i += 2) {
                    int count = Integer.parseInt(input.charAt(i) + "");
                    for (int j = 0; j < count; j++)
                        sb.append(input.charAt(i + 1));

                }
                if (input.equals(sb.toString())) break;

                input = sb.toString();
            }
            System.out.println("Test " + caseN++ + ": " + input);

        }
    }
}
