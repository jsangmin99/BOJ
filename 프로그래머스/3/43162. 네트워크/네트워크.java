class Solution {
        public int solution(int n, int[][] computers) {
            int answer = 0;
            boolean[] visited = new boolean[n];
            for(int i = 0 ; i< n; i++){
                if(visited[i] == false){
                    dfs(computers,i,visited);
                    answer++;
                }
            }
            return answer;
        }
        void dfs(int[][]computers, int n, boolean[] visited){
            visited[n] = true;
            for(int i = 0 ; i<computers.length; i++){
                if(computers[n][i] == 1 && visited[i] == false ){
                    dfs(computers,i,visited);
                }
            }
        }
}