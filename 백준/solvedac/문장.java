package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문장 {
    static String[] oneToNine = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };
    static String[] tenToNineteen = {
            "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    static String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty",
            "seventy", "eighty", "ninety"
    };
    static String[] hundreds = {
            "", "onehundred", "twohundred", "threehundred", "fourhundred",
            "fivehundred", "sixhundred", "sevenhundred", "eighthundred", "ninehundred"
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        int count = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
            if (words[i].equals("$")) {
                index = i;
            } else {
                count += words[i].length();
            }
        }
        for (int i = 1; i < 1000; i++) {
            String wordNum = numToWord(i);
            int totalLen = count + wordNum.length();
            if (totalLen == i) {
                words[index] = wordNum;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(words[i]);
            if (i < n - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }

    static String numToWord(int num) {
        StringBuilder sb = new StringBuilder();
        int h = num / 100;
        int rem = num % 100;
        if (h > 0) {
            sb.append(hundreds[h]);
        }
        if (rem >= 10 && rem <= 19) {
            sb.append(tenToNineteen[rem - 10]);
        } else {
            int t = rem / 10;
            int o = rem % 10;
            if (t > 0) {
                sb.append(tens[t]);
            }
            if (o > 0) {
                sb.append(oneToNine[o]);
            }
        }
        return sb.toString();

    }
}
