package solvedac;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 핸드폰요금 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int youngsikCount = 0;
        int minsikCount = 0;
        for (int i : arr) {
            if (i % 30 >= 0) {
                youngsikCount += 10;
            }
            youngsikCount += i / 30 * 10;

            if (i % 60 >= 0) {
                minsikCount += 15;
            }
            minsikCount += i / 60 * 15;
        }


        // 출력
        if (minsikCount > youngsikCount) {
            System.out.println("Y " + youngsikCount);
        } else if (minsikCount < youngsikCount) {
            System.out.println("M " + minsikCount);
        } else {
            System.out.println("Y M " + minsikCount);
        }

    }
}