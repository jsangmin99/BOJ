import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");

        String c = br.readLine();
        int result = 0;
        for(int i = 0 ; i <n; i++){
            if(s[i].equals(c)){
                result++;
            }
        }
        System.out.println(result);
    }
    
}
