import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 학생 수

        int[][] arr = new int[n][5]; // 각 학생의 학년별 반 정보

        // 입력 처리
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxCount = 0; // 최대 같은 반 인원 수
        int leader = 1; // 임시 반장 번호 (초기값 1번 학생)

        // 학생별로 같은 반이었던 사람 수 계산
        for (int i = 0; i < n; i++) {
            HashSet<Integer> uniqueStudents = new HashSet<>(); // 중복된 학생 번호 방지

            for (int j = 0; j < n; j++) {
                if (i == j) continue; // 자기 자신 제외

                // 5학년 동안 하나라도 같은 반이었다면
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        uniqueStudents.add(j);
                        break; // 중복 카운트를 막기 위해 바로 종료
                    }
                }
            }

            int count = uniqueStudents.size(); // 중복 제거된 학생 수

            // 최대값 갱신 및 임시 반장 번호 업데이트
            if (count > maxCount) {
                maxCount = count;
                leader = i + 1; // 학생 번호는 1부터 시작
            } else if (count == maxCount && i + 1 < leader) {
                // 같은 최대값인 경우 더 작은 번호 선택
                leader = i + 1;
            }
        }

        // 결과 출력
        System.out.println(leader);
    }
}
