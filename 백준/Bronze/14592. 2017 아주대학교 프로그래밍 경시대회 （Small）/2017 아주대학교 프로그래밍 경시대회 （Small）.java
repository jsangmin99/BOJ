import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static class Participant {
        int id;
        int score;
        int count;
        int time;

        Participant(int id, int score, int count, int time) {
            this.id = id;
            this.score = score;
            this.count = count;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Participant> list = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int score = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            int uploadTime = Integer.parseInt(st.nextToken());
            list.add(new Participant(i + 1, score, count, uploadTime));
        }
        list.sort((a,b) -> {
            if(a.score != b.score) return Integer.compare(b.score, a.score);
            if (a.count != b.count) return Integer.compare(a.count, b.count);
            return Integer.compare(a.time, b.time);
        });

        System.out.println(list.get(0).id);

    }

}
