package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 두수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 배열 크기 입력
        int N = Integer.parseInt(br.readLine());
        if (N < 2) {
            System.out.println(0); // 두 수를 선택할 수 없는 경우
            return;
        }

        // 2. 배열 입력
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 3. 목표 값 입력
        int X = Integer.parseInt(br.readLine());

        // 4. 배열 정렬
        Arrays.sort(arr);

        // 5. 이중 포인터로 두 수의 합 계산
        int left = 0;
        int right = N - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == X) {
                count++;
                left++;
                right--;
            } else if (sum < X) {
                left++;
            } else {
                right--;
            }
        }

        // 6. 결과 출력
        System.out.println(count);
    }
}
