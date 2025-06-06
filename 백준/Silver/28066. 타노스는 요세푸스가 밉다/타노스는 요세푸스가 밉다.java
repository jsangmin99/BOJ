import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

    
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 1; i <=n; i++){
            dq.add(i);
        }

        while (dq.size()>1) {
            if (dq.size() >=k) {
                List<Integer> selected = new ArrayList<>();
                for(int i = 0; i < k; i++){
                    selected.add(dq.pollFirst());
                }
                dq.add(selected.get(0));
            } else{
                // 첫번쨰만 살리고 나머지 다죽임
                int survive = dq.pollFirst();
                dq.clear();
                dq.add(survive);
            }
        }
        System.out.println(dq.poll());
    }
    
}
