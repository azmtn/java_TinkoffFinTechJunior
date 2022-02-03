import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        if (a > b && (a + b) % 2 == 0 && (a - b) >= 2 * n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
