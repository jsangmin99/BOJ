package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 숫자놀이 {
    private static final String[] DIGITS = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        List<Integer> numbers = new ArrayList<>();
        Map<Integer, String> englishMap = new HashMap<>();

//        숫자를 영어로 변환후 리스트에 저장
        for (int i = m; i <= n; i++) {
            String english = numberToEnglish(i);
            englishMap.put(i, english);
            numbers.add(i);
        }

        numbers.sort(Comparator.comparing(englishMap::get));

        for (int i = 0; i < numbers.size(); i++) {
            if (i > 0 && i % 10 == 0) {
                System.out.println();
            }
            System.out.print(numbers.get(i) + " ");
        }

    }

    private static String numberToEnglish(int num) {
        String numStr = String.valueOf(num);
        StringBuilder english = new StringBuilder();
        for (char digit : numStr.toCharArray()) {
            if (!english.isEmpty()) {
                english.append(" ");
            }
            english.append(DIGITS[digit - '0']);
        }
        return english.toString();
    }
}
