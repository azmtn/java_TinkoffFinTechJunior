import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] jumpLengths = new int[n];
        int[] slidingLengths = new int[n];

        for (int i = 0; i < jumpLengths.length; i++) {
            jumpLengths[i] = scanner.nextInt();
        }

        for (int i = 0; i < slidingLengths.length; i++) {
            slidingLengths[i] = scanner.nextInt();
        }
    }
}