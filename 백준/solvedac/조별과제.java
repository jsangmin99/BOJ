import java.io.*;
import java.util.*;

public class 조별과제 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            System.out.printf("#%d %d \n", i, n / 3);
        }

    }

}
