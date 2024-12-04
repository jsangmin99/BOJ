import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N 입력
        int N = sc.nextInt();

        // 순열 입력
        int[] perm = new int[N];
        for (int i = 0; i < N; i++) {
            perm[i] = sc.nextInt();
        }

        // 1. 뒤에서부터 내림차순으로 연속된 부분 찾기
        int i = N - 1;
        while (i > 0 && perm[i - 1] <= perm[i]) {
            i--;
        }

        // 2. 만약 이미 가장 작은 순열이라면 -1 출력
        if (i == 0) {
            System.out.println(-1);
        } else {
            // 3. 감소하는 부분에서 왼쪽보다 작은 값 중 가장 큰 값 찾기
            int j = N - 1;
            while (perm[j] >= perm[i - 1]) {
                j--;
            }

            // 4. 두 값을 교환
            swap(perm, i - 1, j);

            // 5. 교환 후 뒤쪽 부분을 내림차순으로 정렬
            reverse(perm, i, N);

            // 결과 출력
            for (int num : perm) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }

    // 배열 내 두 값을 교환하는 함수
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 배열의 부분을 뒤집는 함수
    private static void reverse(int[] arr, int start, int end) {
        end--; // 마지막 인덱스
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
