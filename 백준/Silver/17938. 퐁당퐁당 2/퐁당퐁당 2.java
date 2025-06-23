import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 사람 수
        int P = sc.nextInt(); // 휘수 위치
        int T = sc.nextInt(); // 차례 번호

        int armCount = 1;
        boolean increasing = true;
        int totalArms = 2 * N;

        int startIndex = 0; // 시작 팔 인덱스

        for (int turn = 1; turn < T; turn++) {
            startIndex = (startIndex + armCount) % totalArms;

            // 다음 턴의 팔 수 조정
            if (increasing) {
                armCount++;
                if (armCount == totalArms) {
                    increasing = false;
                }
            } else {
                armCount--;
                if (armCount == 1) {
                    increasing = true;
                }
            }
        }

        // T번째 턴에서 팔을 드는 사람들 계산
        for (int i = 0; i < armCount; i++) {
            int idx = (startIndex + i) % totalArms;
            int person = (idx / 2) + 1; // 팔 인덱스 → 사람 번호
            if (person == P) {
                System.out.println("Dehet YeonJwaJe ^~^");
                return;
            }
        }

        System.out.println("Hing...NoJam");
    }
}
