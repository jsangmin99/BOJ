import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int) (right - left + 1);
        int[] arr = new int[size];
        
        for(int i = 0 ; i < size; i++){
            long index = left + i;
            int col = (int) (index / n);
            int row = (int) (index % n);
            arr[i] = Math.max(col, row) + 1;
        }
        return arr;
    }
}