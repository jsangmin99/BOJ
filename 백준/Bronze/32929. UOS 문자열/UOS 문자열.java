import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        if(n % 3 == 0){
            System.out.println("S");
        } else if (n % 3 == 1) {
            System.out.println("U");
        }else{
            System.out.println("O");
        }

    }
}
