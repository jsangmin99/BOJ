package solvedac;

import java.io.*;
import java.util.*;

public class 자료구조는정말최고야 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 교과서 수
        int M = Integer.parseInt(st.nextToken()); // 더미 수

        // 최소 힙 생성: [현재 교과서 번호, 더미 ID]
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));

        // 각 더미 정보를 저장
        List<Stack<Integer>> stacks = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int k = Integer.parseInt(br.readLine()); // 현재 더미의 교과서 수
            Stack<Integer> stack = new Stack<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                stack.push(Integer.parseInt(st.nextToken()));
            }
            stacks.add(stack);
            // 최소 힙에 각 더미의 최상단 값 삽입
            if (!stack.isEmpty()) {
                pq.offer(new int[]{stack.pop(), i});
            }
        }

        // 순서대로 교과서를 꺼낼 수 있는지 확인
        int expected = 1;
        while (!pq.isEmpty()) {
            int[] top = pq.poll(); // [현재 교과서 번호, 더미 ID]
            int current = top[0];
            int stackId = top[1];

            if (current != expected) {
                System.out.println("No");
                return;
            }

            expected++;

            // 해당 더미에서 다음 교과서를 힙에 추가
            if (!stacks.get(stackId).isEmpty()) {
                pq.offer(new int[]{stacks.get(stackId).pop(), stackId});
            }
        }

        // 모든 교과서를 올바른 순서로 꺼냈다면 Yes 출력
        System.out.println("Yes");
    }
}
