import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roomNumber = scanner.next();
        scanner.close();

        int[] digitCount = new int[10]; // 0부터 9까지 숫자의 개수를 저장할 배열

        // 방 번호의 각 숫자 빈도를 계산
        for (char c : roomNumber.toCharArray()) {
            digitCount[c - '0']++;
        }

        // 6과 9는 서로 교환 가능하므로 특별 처리
        int sixAndNineCount = digitCount[6] + digitCount[9];
        digitCount[6] = (sixAndNineCount + 1) / 2; // 필요한 세트 수 계산 (올림)
        digitCount[9] = 0; // 9는 처리 완료했으므로 초기화

        // 최대 값 계산 (가장 많이 필요한 숫자의 세트 수가 전체 세트 수)
        int maxSets = 0;
        for (int count : digitCount) {
            maxSets = Math.max(maxSets, count);
        }

        System.out.println(maxSets);
    }
}
