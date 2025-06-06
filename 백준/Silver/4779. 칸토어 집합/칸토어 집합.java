import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            int length = (int) Math.pow(3, n);
            char[] arr = new char[length];

            for (int i = 0; i < length; i++) {
                arr[i] = '-';
            }

            makeCantor(arr, 0, length);

            System.out.println(new String(arr));
        }
    }

    private static void makeCantor(char[] arr, int start, int length) {
        if (length == 1) {
            return;
        }

        int third = length / 3;

        for (int i = start + third; i < start + 2 * third; i++) {
            arr[i] = ' ';
        }

        makeCantor(arr, start, third);
        makeCantor(arr, start + 2 * third, third);
    }
}