package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알고리즘수업힙정렬1 {
    static int count = 0;
    static int k;
    static int[] result = new int[2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        buildMinHeap(arr, n);

        for (int i = n; i >= 2; i--) {
            swap(arr, 1, i);
            heapify(arr, 1, i - 1);
        }

        if (count < k) {
            System.out.println(-1);
        } else {
            System.out.println(result[0] + " " + result[1]);
        }
    }

    static void buildMinHeap(int[] arr, int n) {
        for (int i = n / 2; i >= 1; i--) {
            heapify(arr, i, n);
        }
    }

    static void heapify(int[] arr, int k, int n) {
        int left = 2 * k;
        int right = 2 * k + 1;
        int smaller;

        if (right <= n) {
            smaller = (arr[left] < arr[right]) ? left : right;
        } else if (left <= n) {
            smaller = left;
        } else {
            return;
        }
        if (arr[smaller] < arr[k]) {
            swap(arr, k, smaller);
            heapify(arr, smaller, n);
        }


    }

    static void swap(int[] arr, int i, int j) {
        count++;
        if (count == k) {
            result[0] = Math.min(arr[i], arr[j]);
            result[1] = Math.max(arr[i], arr[j]);
        }
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
