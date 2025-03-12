import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int N = scanner.nextInt(); // 학생 수
        int K = scanner.nextInt(); // 한 방의 최대 인원 수
        
        // 학년과 성별을 기반으로 그룹화된 학생 수를 저장할 배열
        int[][] students = new int[6][2]; // (학년 1~6) * (여, 남)
        
        for (int i = 0; i < N; i++) {
            int gender = scanner.nextInt(); // 0: 여학생, 1: 남학생
            int grade = scanner.nextInt();
            students[grade - 1][gender]++;
        }
        
        // 최소 방 개수 계산
        int rooms = 0;
        
        // 1~2학년은 성별 관계없이 함께 배정 가능
        int lowerGradeStudents = students[0][0] + students[0][1] + students[1][0] + students[1][1];
        rooms += (lowerGradeStudents + K - 1) / K;
        
        // 3~4학년, 5~6학년은 성별 별도 배정
        for (int i = 2; i < 6; i += 2) {
            for (int j = 0; j < 2; j++) {
                int groupStudents = students[i][j] + students[i + 1][j];
                rooms += (groupStudents + K - 1) / K; // 올림 처리하여 필요한 방 수 계산
            }
        }
        
        // 결과 출력
        System.out.println(rooms);
    }
}