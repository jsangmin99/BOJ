import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용해 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄: N
        int N = Integer.parseInt(br.readLine());
        
        // SortedSet 사용
        Set<Integer> numbers = new TreeSet<>();
        
        // 두 번째 줄: 숫자 입력 처리
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }
        
        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
