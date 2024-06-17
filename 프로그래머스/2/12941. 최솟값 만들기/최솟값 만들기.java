import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        for(int i = 0; i < A.length; i++){
            aList.add(A[i]);
            bList.add(B[i]);
        }
//        오름차순
        aList.sort((x, y) -> x - y);
//        내림차순
        bList.sort((x, y) -> y - x);

        for(int i = 0; i < aList.size(); i++){
            answer += aList.get(i) * bList.get(i);
        }

        return answer;
    }
}