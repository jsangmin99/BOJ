import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1부터 20까지 카드 초기화
        List<Integer> cards = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            cards.add(i);
        }

        // 10개의 구간 입력 처리
        for (int t = 0; t < 10; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 구간 [a, b]의 카드 역순으로 뒤집기
            reverse(cards, a - 1, b - 1); // 0-based index로 변환
        }

        // 결과 출력
        for (int card : cards) {
            System.out.print(card + " ");
        }
    }

    // 구간 [start, end]를 뒤집는 메서드
    private static void reverse(List<Integer> list, int start, int end) {
        while (start < end) {
            // 두 위치의 값을 스왑
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}
