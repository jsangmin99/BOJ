import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String V = br.readLine();

        int U = 0; // 윤이 표
        int D = 0; // D 또는 P → 애매한 표
        StringBuilder answer = new StringBuilder();

        for (char ch : V.toCharArray()) {
            if (ch == 'U' || ch == 'C') {
                U++;
            } else if (ch == 'D' || ch == 'P') {
                D++;
            }
        }

        if ((D % 2 == 0 && U > D / 2) || (D % 2 == 1 && U > D / 2 + 1)) {
            answer.append("U");
        }

        if (D > 0) {
            answer.append("D");
            answer.append("P");
        }

        if (answer.length() == 0) {
            answer.append("C");
        }

        System.out.println(answer);
    }
}
