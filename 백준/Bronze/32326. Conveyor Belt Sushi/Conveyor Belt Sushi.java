import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int R = scanner.nextInt(); // 빨간 접시 개수
        int G = scanner.nextInt(); // 초록 접시 개수
        int B = scanner.nextInt(); // 파란 접시 개수
        
        scanner.close();
        
        // 가격 계산
        int cost = (R * 3) + (G * 4) + (B * 5);
        
        // 결과 출력
        System.out.println(cost);
    }
}
