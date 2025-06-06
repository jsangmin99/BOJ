import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 수빈이의 위치
        int K = scanner.nextInt(); // 동생의 위치
        scanner.close();

        // 범위 설정
        int max = 100000;
        boolean[] visited = new boolean[max + 1];

        // BFS를 위한 큐
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{N, 0}); // 초기 위치와 시간

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int position = current[0];
            int time = current[1];

            // 동생을 찾은 경우
            if (position == K) {
                System.out.println(time);
                return;
            }

            // 방문 처리
            if (position < 0 || position > max || visited[position]) {
                continue;
            }
            visited[position] = true;

            // 다음 이동 가능 위치를 큐에 추가
            if (position - 1 >= 0) queue.offer(new int[]{position - 1, time + 1});
            if (position + 1 <= max) queue.offer(new int[]{position + 1, time + 1});
            if (position * 2 <= max) queue.offer(new int[]{position * 2, time + 1});
        }
    }
}
