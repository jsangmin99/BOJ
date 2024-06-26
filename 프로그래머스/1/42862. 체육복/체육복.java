class Solution{
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n];
        for (int j : lost) {
            students[j - 1]--;
        }
        for (int j : reserve) {
            students[j - 1]++;
        }
        for(int i = 0; i < students.length; i++){
            if(students[i] == -1){
                if(i != 0 && students[i-1] == 1){
                    students[i]++;
                    students[i-1]--;
                }else if(i != students.length-1 && students[i+1] == 1){
                    students[i]++;
                    students[i+1]--;
                }
            }
        }
        for (int student : students) {
            if (student >= 0) {
                answer++;
            }
        }
        return answer;
    }
}