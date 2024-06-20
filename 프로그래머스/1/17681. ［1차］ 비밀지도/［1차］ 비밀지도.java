import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // arr1[i] | arr2[i] 를 이진 문자열로 변환하고, 길이를 n으로 맞춤
            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i])).replace(' ', '0');

            StringBuilder row = new StringBuilder();
            for (char c : binaryString.toCharArray()) {
                if (c == '1') {
                    row.append("#");
                } else {
                    row.append(" ");
                }
            }
            answer[i] = row.toString();
        }

        return answer;
    }
}
