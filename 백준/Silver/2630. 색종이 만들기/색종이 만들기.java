import java.util.*;
import java.io.*;

public class Main {
  static int n;
  static int [][] arr;
  static int whitePaper;
  static int colorPaper;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    n = Integer.parseInt(br.readLine());
    arr= new int[n][n];

    StringTokenizer st;
    for(int i = 0; i< n; i++){
      st = new StringTokenizer(br.readLine());
      for(int j = 0 ; j < n; j++){
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    countPaper(n, 0 , 0);

    System.out.println(whitePaper);
    System.out.println(colorPaper);
  }

  static void countPaper(int size, int x, int y){
    if(isSame(size, x, y)){
      if(arr[x][y] == 0) whitePaper++;
      else colorPaper++;
      return;
    }

    int newSize = size/2;
    countPaper(newSize, x,y);
    countPaper(newSize, x, y+newSize);
    countPaper(newSize, x + newSize, y);
    countPaper(newSize, x + newSize, y+newSize);
  
  }

  static boolean isSame(int size, int x, int y){
    int color = arr[x][y]; // 기준색
    for(int i = x; i < x+size; i++){
      for(int j = y; j < y + size; j++){
        if(arr[i][j] != color){
          return false;
        }
      }
    }
    return true;
  }
}
 
