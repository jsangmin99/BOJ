import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //IO 의 갯수 
        int m = Integer.parseInt(br.readLine()); //문자열 S 의 길이
        String s = br.readLine();

        String IO = "";
        int count = 0;
        int i = 0;
        int patternCount = 0;

        while (i < m - 1) {
            if (s.charAt(i) == 'I' && i + 1 < m && s.charAt(i + 1) == 'O') {
                int tempCount = 0;

                while (i + 2 < m && s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I') {
                    tempCount++;
                    i += 2;
                    if (tempCount >= n) {
                        count++;
                    }
                }
            }
            i++;
        }
        System.out.println(count);



    }
}
