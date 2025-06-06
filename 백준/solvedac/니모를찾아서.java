package solvedac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 니모를찾아서 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = br.readLine();
            if (line.equals("EOI")) {
                break;
            }
            if (line.toLowerCase().contains("nemo")) {
                System.out.println("Found");
            } else {
                System.out.println("Missing");
            }

        }
    }
}
