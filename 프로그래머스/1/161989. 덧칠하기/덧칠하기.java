class Solution {
    public int solution(int n, int m, int[] section) {
//         롤러의 길이 m
//         전체 길이가 n
//         빈공간 section
//         1 ≤ m ≤ n ≤ 100,000
        int answer = 1;
        int start = section[0];
        int end = start + m-1;

        for (int i = 1; i < section.length; i++) {
            if(section[i] <= end){
                continue;
            }else if(section[i] >= end){
                start = section[i];
                end = start+m-1;
                answer++;
            }
        }
        return answer;
    }
}