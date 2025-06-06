import java.io.*;
import java.util.*;

public class 평행사변형 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < t; i++){
            int x = Integer.parseInt(br.readLine());
            System.out.println("#" + (i+1) + " " + x*x);
        }
        
    }
    
}
