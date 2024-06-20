import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        // 각 스테이지에 도달한 사용자 수를 저장할 배열
        int[] reached = new int[N + 1];
        // 각 스테이지에 실패한 사용자 수를 저장할 배열
        int[] notCleared = new int[N + 1];

        // 스테이지에 도달한 사용자 수와 실패한 사용자 수를 카운트
        for (int stage : stages) {
            for (int i = 0; i < stage && i < N; i++) {
                reached[i]++;
            }
            if (stage <= N) {
                notCleared[stage - 1]++;
            }
        }

        // 실패율을 계산하고 이를 저장할 리스트
        List<StageFailureRate> failureRates = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            double failureRate = (reached[i] == 0) ? 0 : (double) notCleared[i] / reached[i];
            failureRates.add(new StageFailureRate(i + 1, failureRate));
        }

        // 실패율을 기준으로 내림차순 정렬
        Collections.sort(failureRates, (a, b) -> {
            if (b.failureRate != a.failureRate) {
                return Double.compare(b.failureRate, a.failureRate);
            } else {
                return Integer.compare(a.stage, b.stage);
            }
        });

        // 결과를 저장할 배열
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = failureRates.get(i).stage;
        }

        return result;
    }
}

// 스테이지 번호와 실패율을 저장할 클래스
class StageFailureRate {
    int stage;
    double failureRate;

    StageFailureRate(int stage, double failureRate) {
        this.stage = stage;
        this.failureRate = failureRate;
    }
}