import java.io.*;

public class 수학은체육과목입니다2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = { 2, 1, 2, 3, 4, 5, 4, 3 };

        System.out.println(arr[n % 8]);

    }

}
