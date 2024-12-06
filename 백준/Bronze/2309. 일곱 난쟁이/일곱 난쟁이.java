import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] heights = new int[9];
        int totalSum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            totalSum += heights[i];
        }

        // 두 난쟁이 찾기
        outerLoop:
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (totalSum - heights[i] - heights[j] == 100) {
                    // i와 j를 제외한 난쟁이만 남기기
                    heights[i] = 0;
                    heights[j] = 0;
                    break outerLoop; // 두 난쟁이를 찾으면 반복 종료
                }
            }
        }

        // 0이 아닌 값만 오름차순으로 출력
        Arrays.sort(heights);
        for (int i = 2; i < 9; i++) { // 0인 값 두 개를 제외하고 출력
            System.out.println(heights[i]);
        }
    }
}
