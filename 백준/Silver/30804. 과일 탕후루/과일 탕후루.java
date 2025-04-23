import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        1. 입력
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] fruits = new int[n];

        for(int i = 0; i < n; i++){
            fruits[i] = Integer.parseInt(st.nextToken());
        }

//        투포인터를 사용하여 양 옆에서 하나씩 제거
        Map<Integer, Integer> countMap = new HashMap<>(); // <과일번호, 갯수>
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < n; right++){
//            현재 과일 추가
            countMap.put(fruits[right], countMap.getOrDefault(fruits[right], 0) + 1);
            while (countMap.size() > 2) {
                int leftFruit = fruits[left];
                countMap.put(leftFruit, countMap.get(leftFruit) - 1);

//                갯수가 0 이면 맵에서 삭제
                if (countMap.get(leftFruit) == 0) {
                    countMap.remove(leftFruit);
                }

                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);

    }
}
