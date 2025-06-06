import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] values = input.split("/");
        int K = Integer.parseInt(values[0]);
        int D = Integer.parseInt(values[1]);
        int A = Integer.parseInt(values[2]);

        if (K + A < D || D == 0) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }
    }
}
