import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            map.put(st.nextToken(), 0);
        }
        for (int i = 0; i < n; i++) {
            String[] likes = br.readLine().split(" ");
            for (String s : likes) {
                map.put(s, map.get(s) + 1);
            }
        }

        List<String> resultList = new ArrayList<>(map.keySet());
        resultList.sort((a, b) -> {
            // 먼저 두 학생의 인기도를 비교 (내림차순 정렬이므로 b를 먼저 넣음)
            int cmp = Integer.compare(map.get(b), map.get(a));

            // 인기도가 다르면 그 차이로 정렬
            if (cmp != 0) {
                return cmp;
            }

            // 인기도가 같으면 이름을 알파벳 오름차순으로 정렬
            return a.compareTo(b);
        });

        for (String s : resultList) {
            System.out.println(s + " " + map.get(s));
        }

    }

}
