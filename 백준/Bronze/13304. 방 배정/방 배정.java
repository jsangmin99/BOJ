import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int N = scanner.nextInt(); // 학생 수
        int K = scanner.nextInt(); // 한 방의 최대 인원 수
        
        // 학년과 성별을 기반으로 그룹화된 학생 수를 저장할 배열
        int[][] students = new int[3][2]; // (1-2학년, 3-4학년, 5-6학년) * (여, 남)
        
        for (int i = 0; i < N; i++) {
            int gender = scanner.nextInt(); // 0: 여학생, 1: 남학생
            int grade = scanner.nextInt();
            
            if (grade <= 2) {
                students[0][gender]++;
            } else if (grade <= 4) {
                students[1][gender]++;
            } else {
                students[2][gender]++;
            }
        }
        
        // 최소 방 개수 계산
        int rooms = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                rooms += (students[i][j] + K - 1) / K; // 올림 처리하여 필요한 방 수 계산
            }
        }
        
        // 결과 출력
        System.out.println(rooms);
    }
}