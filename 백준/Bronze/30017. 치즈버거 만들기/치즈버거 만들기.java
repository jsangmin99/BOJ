import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int patty = sc.nextInt();
        int cheese = sc.nextInt();
        int useCheese = Math.min(cheese, patty-1);
        int usePatty = useCheese+1;
        System.out.println(useCheese + usePatty);
    }
}