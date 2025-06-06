package solvedac;

import java.io.*;
import java.util.*;

public class 원의둘레 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;
    StringBuilder sb = new StringBuilder();

    while ((line = br.readLine()) != null && !line.isEmpty()) {
      StringTokenizer st = new StringTokenizer(line);
      double x1 = Double.parseDouble(st.nextToken());
      double y1 = Double.parseDouble(st.nextToken());
      double x2 = Double.parseDouble(st.nextToken());
      double y2 = Double.parseDouble(st.nextToken());
      double x3 = Double.parseDouble(st.nextToken());
      double y3 = Double.parseDouble(st.nextToken());

      // 원의 중심과 반지름을 구함
      double radius = getCircumcircleRadius(x1, y1, x2, y2, x3, y3);
      double circumference = 2 * Math.PI * radius;

      // 결과를 소수점 둘째 자리까지 반올림하여 저장
      sb.append(String.format("%.2f\n", circumference));
    }
    System.out.print(sb);
  }

  // 세 점을 이용하여 원의 반지름을 구하는 함수
  private static double getCircumcircleRadius(double x1, double y1, double x2, double y2, double x3, double y3) {
    double a = distance(x2, y2, x3, y3);
    double b = distance(x1, y1, x3, y3);
    double c = distance(x1, y1, x2, y2);

    double s = (a + b + c) / 2; // 헤론의 공식에서 반둘레
    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // 삼각형의 넓이

    // 삼각형의 외접원의 반지름 공식: R = (abc) / (4 * 삼각형의 넓이)
    return (a * b * c) / (4 * area);
  }

  // 두 점 사이의 거리 계산
  private static double distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  }
}
