import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String dolimpan = br.readLine();
        char last = dolimpan.charAt(dolimpan.length() - 1);

        int wantLen = Integer.parseInt(br.readLine());
        String wantS = br.readLine();

        Map<Character, List<Integer>> positions = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = dolimpan.charAt(i);
            positions.putIfAbsent(c, new ArrayList<>());
            positions.get(c).add(i);
        }

        int current = n - 1;
        int count = 0;

        for (int i = 0; i < wantLen; i++) {
            char target = wantS.charAt(i);
            if (!positions.containsKey(target)) {
                System.out.println(-1);
                return;
            }
            int minDistance = Integer.MAX_VALUE;
            for (int pos : positions.get(target)) {
                int dist = (pos - current + n) % n;
                if (dist == 0)
                    dist = n; 
                minDistance = Math.min(minDistance, dist);
            }
            count += minDistance;
            current = (current + minDistance) % n;
        }
        System.out.println(count);
    }

}
