import java.io.*;
import java.util.*;

public class 성장의비약선택권 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N < 206) {
            System.out.println(1);
        } else if ( N < 218) {
            System.out.println(2);
        } else if ( N < 229) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }

}
