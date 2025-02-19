import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    StringTokenizer st;
    for (int i = 0; i < T; i++){
      st = new StringTokenizer(br.readLine());
      long a = Long.parseLong(st.nextToken());
      char sign = st.nextToken().charAt(0);
      long b = Long.parseLong(st.nextToken());
      st.nextToken();
      long out = Long.parseLong(st.nextToken());

      long result = 0;

      if (sign == '+'){
        result = a+b;
      } else if(sign == '*'){
        result = a*b;
      } else if(sign == '/'){
        result = a/b;
      } else if(sign == '-'){
        result = a-b;
      }
      
      if(result == out){
        System.out.println("correct");
      }else{
        System.out.println("wrong answer");
      }

    }
  }
}