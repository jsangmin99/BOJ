import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 테스트 케이스 수
        StringBuilder result = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt(); // 후보자 수
            int[] votes = new int[n];
            int totalVotes = 0;

            // 투표 수 입력 및 전체 투표 수 계산
            for (int i = 0; i < n; i++) {
                votes[i] = scanner.nextInt();
                totalVotes += votes[i];
            }

            // 최다 득표자 및 득표 수 탐색
            int maxVotes = 0;
            int maxCandidate = -1;
            boolean isTie = false;

            for (int i = 0; i < n; i++) {
                if (votes[i] > maxVotes) {
                    maxVotes = votes[i];
                    maxCandidate = i + 1; // 후보자 번호는 1부터 시작
                    isTie = false;
                } else if (votes[i] == maxVotes) {
                    isTie = true; // 최다 득표자가 여러 명인 경우
                }
            }

            // 결과 결정
            if (isTie) {
                result.append("no winner\n");
            } else {
                if (maxVotes > totalVotes / 2) {
                    result.append("majority winner ").append(maxCandidate).append("\n");
                } else {
                    result.append("minority winner ").append(maxCandidate).append("\n");
                }
            }
        }

        // 결과 출력
        System.out.print(result);
        scanner.close();
    }
}