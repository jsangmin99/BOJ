package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 가운데을말해요 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

//        중간갑 이하를 저장
        PriorityQueue<Integer> leftHeap = new PriorityQueue<>((a, b) -> b - a);
//        중간값 초과를 저장
        PriorityQueue<Integer> rightHeap = new PriorityQueue<>();

        for (int i =0; i< N; i++) {
            int num = Integer.parseInt(br.readLine());

//            중간 이하인 힙이 비어있거나 중간값 이하인 경우 leftHeap에 저장
            if(leftHeap.isEmpty() || num <= leftHeap.peek()) {
                leftHeap.add(num);
            } else { // 중간값 초과인 경우 rightHeap에 저장
                rightHeap.add(num);
            }
//            힙크기 조정
//            짝수이면 작은값을 말해야되니 leftHeap의 크기가 rightHeap보다 1이상 크면 rightHeap에 leftHeap의 최대값을 넣어준다.
            if(leftHeap.size() < rightHeap.size()) {
                leftHeap.add(rightHeap.poll());
            } else if(leftHeap.size() > rightHeap.size() + 1) {
                rightHeap.add(leftHeap.poll());
            }
            System.out.println(leftHeap.peek());
        }

    }
}
