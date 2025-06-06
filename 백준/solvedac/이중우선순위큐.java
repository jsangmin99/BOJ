package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 이중우선순위큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int Q = Integer.parseInt(br.readLine());

            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            Map<Integer, Integer> countMap = new HashMap<>();
            int size = 0;

            for (int i = 0; i < Q; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String command = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                if (command.equals("I")) {
                    minHeap.add(num);
                    maxHeap.add(num);
                    countMap.put(num, countMap.getOrDefault(num, 0) + 1);
                    size++;
                } else if (command.equals("D")) {
                    if (size == 0 ) continue;
                    PriorityQueue<Integer> targetHeap = (num == 1) ? maxHeap : minHeap;

                    while (!targetHeap.isEmpty()) {
                        int val = targetHeap.poll();
                        if (countMap.getOrDefault(val, 0) > 0) {
                            countMap.put(val, countMap.get(val) - 1);
                            size--;
                            break;
                        }
                    }
                }
            }
            // 큐 정리 (유효하지 않은 값 제거)
            while (!minHeap.isEmpty() && countMap.getOrDefault(minHeap.peek(), 0) == 0) {
                minHeap.poll();
            }
            while (!maxHeap.isEmpty() && countMap.getOrDefault(maxHeap.peek(), 0) == 0) {
                maxHeap.poll();
            }

            // 결과 출력
            if (size == 0) {
                sb.append("EMPTY\n");
            } else {
                sb.append(maxHeap.peek()).append(" ").append(minHeap.peek()).append("\n");
            }

        }
        System.out.println(sb);
    }
}
