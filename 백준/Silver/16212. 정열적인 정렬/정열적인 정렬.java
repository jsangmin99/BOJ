import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        arr.sort(Comparator.naturalOrder());

        for(int i : arr){
            System.out.print(i + " ");
        }


    }

}
