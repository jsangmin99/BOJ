import java.util.*;
import java.io.*;

public class 피갤컵 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int month = 1 + (7 * n) % 12;
    int year = 1 + (7 * n) / 12;

    System.out.println((2024 + year-1) + " " + month);
  }
}
