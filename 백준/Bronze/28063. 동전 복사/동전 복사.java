import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int x = sc.nextInt(); 
        int y = sc.nextInt(); 

        if (n > 1) {
            if ((x == 1 || x == n) && (y == 1 || y == n)) {
                System.out.println(2);
            } else if ((x > 1 && x < n && (y == 1 || y == n)) ||
                       (y > 1 && y < n && (x == 1 || x == n))) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }
        } else {
            System.out.println(0);
        }
    }
}
