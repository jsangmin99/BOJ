import java.io.*;
import java.util.*;

public class stdSharedPtr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 객체의 개수
        int m = Integer.parseInt(st.nextToken()); // 포인터의 개수
        int q = Integer.parseInt(st.nextToken()); // 연산의 개수

        int[] pointer = new int[m+1];
        int[] referenceCount = new int[n+1];
        for(int i  = 1 ; i <=m; i++){
            int obj = Integer.parseInt(br.readLine());
            pointer[i] = obj;
            if (obj > 0) {
                referenceCount[obj]++;
            }
        }

        for(int i = 0; i< q; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int x = Integer.parseInt(st.nextToken());

            if (command.equals("reset")) {
                int currentObj = pointer[x];
                if (currentObj > 0) {
                    referenceCount[currentObj]--;
                }
                pointer[x] = 0;
            }else{
                int y = Integer.parseInt(st.nextToken());
                if (command.equals("assign")) {
                    int currentObj = pointer[x];
                    int targetObj = pointer[y];

                    if (currentObj > 0) {
                        referenceCount[currentObj]--;
                    }
                    if (targetObj > 0) {
                        referenceCount[targetObj]++;
                    }
                    pointer[x] = targetObj;
                }else if (command.equals("swap")) {
                    int objX = pointer[x];
                    int objY = pointer[y];
                    pointer[x] = objY;
                    pointer[y] = objX;
                }
            }
        }
        List<Integer> result = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            if (referenceCount[i]>0) {
                result.add(i);
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int obj : result){
            System.out.println(obj);
        }


    }
    
}
