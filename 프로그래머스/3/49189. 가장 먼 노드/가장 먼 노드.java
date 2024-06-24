import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] a : edge) {
            adjList.get(a[0] - 1).add(a[1] - 1);
            adjList.get(a[1] - 1).add(a[0] - 1);
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];

        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            visited[temp] = true;
            for(int i = 0; i < adjList.get(temp).size(); i++){
                int target = adjList.get(temp).get(i);
                if (!visited[target]) {
                    queue.add(target);
                    distance[target] = distance[temp] + 1;
                    visited[target] = true;
                }
            }
        }
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (distance[i] > max) {
                max = distance[i];
                answer = 1;
            } else if (distance[i] == max) {
                answer++;
            }
        }
        return answer;
    }
}