import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 초기 x
        int b = sc.nextInt(); // 초기 y
        int R = sc.nextInt(); // 정원의 크기

        Set<String> flowerSet = new HashSet<>();
        int x = a;
        int y = b;
        int time = 0;

        while (true) {
            String key = x + "," + y;
            if (flowerSet.contains(key)) {
                System.out.println(time);
                return;
            }
            flowerSet.add(key);
            time++;

            int nx = x + 1;
            int ny = y + 1;

            if (nx + ny < R) {
                x = nx;
                y = ny;
            } else {
                x = x / 2;
                y = y / 2;
            }
        }
    }
}
