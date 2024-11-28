import java.io.*;
import java.util.*;

public class Main {
    // 최대공약수를 구하는 함수
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 가로수의 개수
        int[] positions = new int[n]; // 가로수 위치 배열
        
        for (int i = 0; i < n; i++) {
            positions[i] = Integer.parseInt(br.readLine());
        }
        
        // 간격 계산
        int[] gaps = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            gaps[i] = positions[i + 1] - positions[i];
        }

        // 간격 배열의 GCD 계산
        int gcdValue = gaps[0];
        for (int i = 1; i < gaps.length; i++) {
            gcdValue = gcd(gcdValue, gaps[i]);
        }

        // 추가로 심어야 할 가로수의 수 계산
        int treesToAdd = 0;
        for (int gap : gaps) {
            treesToAdd += (gap / gcdValue) - 1;
        }

        // 결과 출력
        System.out.println(treesToAdd);
    }
}
