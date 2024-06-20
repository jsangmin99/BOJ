import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {
//        1번 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//        2번 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//        교차하면서 (짝수번째) 2 and 순차적으로 1345

//        3번 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//        모두 두번씩 31245순

//        정답 : {1, 3, 2, 4, 2};

//        모의고사
        int one[] = {1, 2, 3, 4, 5};
        int two[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int three[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];

        // 맞춘 개수 구하기
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5]) score[0]++;
            if (answers[i] == two[i % 8]) score[1]++;
            if (answers[i] == three[i % 10]) score[2]++;
        }

        // 최대값 구하기
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        // 최대값과 같은 사람 찾기
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (score[i] == maxScore) {
                list.add(i + 1);
            }
        }

        return list;
    }
}