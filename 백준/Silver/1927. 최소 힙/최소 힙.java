import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 결과를 저장할 StringBuilder

        int N = Integer.parseInt(br.readLine()); // 연산의 개수
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 최소 힙

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine()); // 연산 입력

            if (x == 0) {
                // 최소 힙에서 가장 작은 값 출력 후 제거
                if (pq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else {
                // 최소 힙에 값 추가
                pq.add(x);
            }
        }

        System.out.print(sb.toString()); 
    }
    
}
