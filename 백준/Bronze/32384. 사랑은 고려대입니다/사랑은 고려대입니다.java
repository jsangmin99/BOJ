import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String word = "LoveisKoreaUniversity";
        
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            System.out.print(word);
            System.out.print(" ");
        }
    }
}
