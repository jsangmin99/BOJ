import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double h = Double.parseDouble(st.nextToken());
        
        if (a == b) {
            System.out.println("-1");
        } else if (a == 0) {
            double result = (b * b + h * h) * Math.PI;
            System.out.printf("%.7f\n", result);
        } else if (a < b) {
            double x = b * h / (b - a);
            double S = x * x + b * b;
            double s = (x - h) * (x - h) + a * a;
            double result = (S - s) * Math.PI;
            System.out.printf("%.7f\n", result);
        } else { // a > b
            double x = a * h / (a - b);
            double S = x * x + a * a;
            double s = (x - h) * (x - h) + b * b;
            double result = (S - s) * Math.PI;
            System.out.printf("%.7f\n", result);
        }
    }
}
