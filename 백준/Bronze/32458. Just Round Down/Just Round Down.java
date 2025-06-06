import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double x = scanner.nextDouble();
        
        int floorValue = (int) Math.floor(x);
        
        System.out.println(floorValue);
        
        scanner.close();
    }
}