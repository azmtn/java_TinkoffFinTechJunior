import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static long longSqrt(long num) {
        long root = 0;
        while (root * root < num) {
            root++;
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLong();
        }
        scanner.close();
        Arrays.sort(array);

        long minNewNum = 0;
        for (int i = array.length - 1; i >= 0; --i) {
            minNewNum = longSqrt(minNewNum + array[i]);
        }
        System.out.println(minNewNum);
    }
}
