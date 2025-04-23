import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] fruits = new int[N];

        for (int i = 0; i < N; i++) {
            fruits[i] = sc.nextInt();
        }

        // 두 포인터 방식
        Map<Integer, Integer> countMap = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < N; right++) {
            // 현재 과일 추가
            countMap.put(fruits[right], countMap.getOrDefault(fruits[right], 0) + 1);

            // 과일 종류가 2개 초과되면 왼쪽 포인터 이동
            while (countMap.size() > 2) {
                countMap.put(fruits[left], countMap.get(fruits[left]) - 1);
                if (countMap.get(fruits[left]) == 0) {
                    countMap.remove(fruits[left]);
                }
                left++;
            }

            // 현재 윈도우 크기 갱신
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }
}