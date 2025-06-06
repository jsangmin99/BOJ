import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 트리의 필요 ampere 입력
        int treeAmpere = scanner.nextInt();

        // 어댑터의 watt와 volt 입력
        int watt = scanner.nextInt();
        int volt = scanner.nextInt();

        scanner.close();

        // 어댑터의 ampere 계산
        int adapterAmpere = watt / volt;

        // 어댑터가 트리에 적합한지 확인
        if (adapterAmpere >= treeAmpere) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
