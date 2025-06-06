package solvedac;

import java.io.*;
import java.util.*;

public class DSLR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            int output = Integer.parseInt(st.nextToken());
            System.out.println(bfs(input, output));
        }


    }

    private static String bfs(int start, int target) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] isVisited = new boolean[10000];
        Map<Integer, String> commandMap = new HashMap<>();
        queue.add(start);
        isVisited[start] = true;
        commandMap.put(start, "");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == target) {
                return commandMap.get(current);
            }
            int[] nextNumbers = {
                    commandD(current),
                    commandS(current),
                    commandL(current),
                    commandR(current)
            };

            char[] commandWord = {'D', 'S', 'L', 'R'};
            for (int i = 0; i < 4; i++) {
                int next = nextNumbers[i];

                if (!isVisited[next]) {
                    isVisited[next] = true;
                    commandMap.put(next, commandMap.get(current) + commandWord[i]);
                    queue.add(next);
                }
            }
        }
        return "";
    }

    private static int commandD(int n) {
        return (n * 2) % 10000;
    }

    private static int commandS(int n) {
        return (n == 0) ? 9999 : n - 1;
    }

    private static int commandL(int n) {
        int d1 = n / 1000;
        int reset = n % 1000;
        return (reset * 10) + d1;
    }

    private static int commandR(int n) {
        return (n % 10) * 1000 + (n / 10);
    }

}
