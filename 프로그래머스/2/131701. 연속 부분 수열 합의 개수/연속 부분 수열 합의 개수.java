import java.util.*;
class Solution {
    public int solution(int[] elements) {
int n = elements.length;
            Set<Integer> set = new HashSet<>();

            // 배열을 2배로 확장하여 원형 배열처럼 활용
            int[] extended = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                extended[i] = elements[i % n];
            }

            // 부분 수열 합 계산 (슬라이딩 윈도우 사용)
            for (int length = 1; length <= n; length++) { // 부분 수열 길이
                int sum = 0;

                // 첫 번째 부분 수열의 합 구하기
                for (int i = 0; i < length; i++) {
                    sum += elements[i];
                }
                set.add(sum);

                // 슬라이딩 윈도우로 다음 부분 수열 합 갱신
                for (int start = 1; start < n; start++) {
                    sum = sum - elements[start - 1] + elements[(start + length - 1) % n];
                    set.add(sum);
                }
            }

            return set.size();
    }
}