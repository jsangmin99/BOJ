package solvedac;

import java.util.Scanner;

public class 빼기1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int count = 0;

        while (N > 0) {
            String s = String.valueOf(N);
            if (s.contains("1")) {
                // '1'을 하나 지우기
                int idx = s.indexOf('1');
                String newStr = s.substring(0, idx) + s.substring(idx + 1);

                if (newStr.isEmpty())
                    N = 0;
                else
                    N = Long.parseLong(newStr);

            } else {
                // '1'이 없으면 그냥 1 빼기
                N--;
            }
            count++;
        }

        System.out.println(count);
    }
}
