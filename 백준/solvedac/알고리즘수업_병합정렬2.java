import java.util.*;
import java.io.*;

public class 알고리즘수업_병합정렬2 {
    static int n, k, count = 0;
    static int[] arr, tmp;
    static boolean printed = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n];
        tmp = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println("처음 배열: " + Arrays.toString(arr));
        System.out.println("------------- 병합 정렬 시작 -------------");

        mergeSort(0, n - 1);

        if (!printed) {
            System.out.println("-1");
        }
    }

    private static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            System.out.println("mergeSort 호출: left=" + left + ", mid=" + mid + ", right=" + right);

            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    private static void merge(int left, int mid, int right) {
        System.out.println("\n[병합 단계] 병합 대상: arr[" + left + "..." + mid + "] + arr[" + (mid + 1) + "..." + right + "]");
        System.out.println(" → 병합 전 배열: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));

        int L = left;
        int M = mid + 1;
        int t = 0;

        while (L <= mid && M <= right) {
            if (arr[L] <= arr[M]) {
                tmp[t++] = arr[L++];
            } else {
                tmp[t++] = arr[M++];
            }
        }
        while (L <= mid) {
            tmp[t++] = arr[L++];
        }
        while (M <= right) {
            tmp[t++] = arr[M++];
        }

        L = left;
        t = 0;
        while (L <= right) {
            arr[L] = tmp[t++];
            count++;
            if (count == k) {
                System.out.println("👉 K번째(" + k + ") 변경 발생! 현재 배열:");
                printArray();
                printed = true;
                return;
            }
            L++;
        }

        System.out.println(" → 병합 후 배열: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
        System.out.println("누적 변경 횟수: " + count);
    }

    static void printArray() {
        StringBuilder sb = new StringBuilder();
        for (int value : arr) {
            sb.append(value).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
