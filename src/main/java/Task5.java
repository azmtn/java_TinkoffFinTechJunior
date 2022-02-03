import java.util.Scanner;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] jumpLengths = new int[n];
        int[] slidingLengths = new int[n];
        int[] jumpsNumber = new int[n + 1];
        Arrays.fill(jumpsNumber, -1);

        for (int i = jumpLengths.length - 1; i >= 0; --i) {
            jumpLengths[i] = scanner.nextInt();
        }

        for (int i = slidingLengths.length - 1; i >= 0; --i) {
            slidingLengths[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(jumpLengths));
        System.out.println(Arrays.toString(slidingLengths));

        int step = 0;
        while (jumpsNumber[n] == -1) {
        }

        System.out.println(Arrays.toString(jumpsNumber));
    }
}