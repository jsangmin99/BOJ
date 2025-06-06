import java.io.*;
import java.util.*;

public class 식당메뉴 {

    static class Student {
        int id;
        int favorite;

        Student(int id, int favorite) {
            this.id = id;
            this.favorite = favorite;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Student> dq = new LinkedList<>();
        List<Integer> arrA = new ArrayList<>();
        List<Integer> arrB = new ArrayList<>();
        List<Integer> arrC = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int type = Integer.parseInt(st.nextToken());
            if (type == 1) {
                int studentNumber = Integer.parseInt(st.nextToken());
                int loveMenu = Integer.parseInt(st.nextToken());
                dq.add(new Student(studentNumber, loveMenu));
            }
            if (type == 2) {
                int menu = Integer.parseInt(st.nextToken());
                Student student = dq.poll();
                if (student.favorite == menu) {
                    arrA.add(student.id);
                } else {
                    arrB.add(student.id);
                }
            }
        }

        while (!dq.isEmpty()) {
            arrC.add(dq.poll().id);
        }

        printList(arrA);
        printList(arrB);
        printList(arrC);

    }

    private static void printList(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("None");
        } else {
            Collections.sort(list);
            for (int id : list) {
                System.out.print(id + " ");
            }
            System.out.println();
        }
    }

}
