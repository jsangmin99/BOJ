import java.util.*;
import java.io.*;

public class Main {
    static int n, k, count =0;
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
        mergeSort(0, n - 1);

        if (!printed) {
            System.out.println(-1);
        }

    }

    private static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    private static void merge(int left, int mid, int right){
        int L = left;
        int M = mid +1;
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
            if(count == k){
                printArray();
                printed = true;
                return;
            }
            L++;
        }
    }
    static void printArray() {
        StringBuilder sb = new StringBuilder();
        for (int value : arr) {
            sb.append(value).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

}
