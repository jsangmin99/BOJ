import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 줄임말만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] words = s.split(" ");

        String[] ignore = { "i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili" };
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                result.append(Character.toUpperCase(words[i].charAt(0)));
                continue;
            }

            boolean isIgnored = false;
            for (String skip : ignore) {
                if (words[i].equals(skip)) {
                    isIgnored = true;
                    break;
                }
            }

            if (!isIgnored) {
                result.append(Character.toUpperCase(words[i].charAt(0)));
            }
        }
        System.out.println(result.toString());

    }

}
