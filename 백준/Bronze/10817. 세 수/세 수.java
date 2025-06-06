import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        String[] input = br.readLine().split(" ");
        arr[0] = Integer.parseInt(input[0]);
        arr[1] = Integer.parseInt(input[1]);
        arr[2] = Integer.parseInt(input[2]);

        Arrays.sort(arr);

        System.out.println(arr[1]);
    }
}
