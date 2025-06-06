package solvedac;

import java.util.Arrays;

public class 가가자바정렬 {
    public static void main(String[] args) {
        int[] sortArr1 = new int[] { 1, 4, 2, 9, 5, 8, 7 };
        int[] reverseSortArr1 = new int[] { 1, 4, 2, 9, 5, 8, 7 };
        Arrays.sort(sortArr1);
        for (int i : sortArr1) {
            System.out.print(i + " ");
        }

    }

}
