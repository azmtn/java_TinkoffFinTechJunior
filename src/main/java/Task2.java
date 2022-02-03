import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        scanner.close();

        int count = 0;
        while (n > 0 && m > 0) {
            if (n > m) {
                n -= m;
            } else {
                m -= n;
            }
            count++;
        }
        System.out.println(count);
    }
}
