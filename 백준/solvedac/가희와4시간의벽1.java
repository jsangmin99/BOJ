
import java.io.*;

public class 가희와4시간의벽1 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int railTime = Integer.parseInt(br.readLine());
    int flightTime = Integer.parseInt(br.readLine());

    if(railTime > flightTime){
      System.out.println("flight");
    }else{
      System.out.println("high speed rail");
    }
  }
}
