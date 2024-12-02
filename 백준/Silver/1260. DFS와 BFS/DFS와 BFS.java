import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        boolean[] visited = new boolean[n+1];
        dfs(arr, visited, v);
        System.out.println();
        visited = new boolean[n+1];
        bfs(arr, visited, v);

    }
    public static void dfs(int[][] arr, boolean[] visited, int v){
        visited[v] = true;
        System.out.print(v + " ");
        for(int i = 1; i < arr.length; i++){
            if(arr[v][i] == 1 && !visited[i]){
                dfs(arr, visited, i);
            }
        }
    }
    public static void bfs(int[][] arr, boolean[] visited, int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;
        while(!queue.isEmpty()){
            int temp = queue.poll();
            System.out.print(temp + " ");
            for(int i = 1; i < arr.length; i++){
                if(arr[temp][i] == 1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }


}

