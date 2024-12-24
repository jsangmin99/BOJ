import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 입력 받기
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        
        // A가 B보다 크면 스왑
        if (A > B) {
            long temp = A;
            A = B;
            B = temp;
        }
        
        // A와 B가 같을 경우 처리
        if (A == B) {
            System.out.println(0); // 두 수가 같으면 사이에 있는 정수는 없음
        } else {
            // 두 수 사이에 있는 정수의 개수 계산
            long count = B - A - 1;
            System.out.println(count);
            
            // 두 수 사이의 정수 출력
            for (long i = A + 1; i < B; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
