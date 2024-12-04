package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class 하늘에서정의가빗발친다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Robot> robots = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int speed = Integer.parseInt(st.nextToken());

            // 로봇의 정보 (번호, 시간) 저장
            double distance = Math.sqrt(x * x + y * y); // (0, 0)에서 로봇까지의 거리
            double timeToHit = distance / speed; // 미사일이 로봇을 격추하는 시간

            robots.add(new Robot(i + 1, timeToHit)); // 로봇 번호 (1부터 시작), 격추 시간 저장
        }

        // 정럴
        robots.sort(Comparator.comparingDouble(Robot::getTimeToHit)
                .thenComparingInt(Robot::getId));

        // 출력
        for (Robot robot : robots) {
            System.out.println(robot.getId());
        }
    }

    // 로봇을 나타내는 클래스
    static class Robot {
        private int id; // 로봇 번호
        private double timeToHit; // 미사일이 로봇에 도달하는 시간

        public Robot(int id, double timeToHit) {
            this.id = id;
            this.timeToHit = timeToHit;
        }

        public int getId() {
            return id;
        }

        public double getTimeToHit() {
            return timeToHit;
        }
    }
}
