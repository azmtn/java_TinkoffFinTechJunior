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
        scanner.close();

        int step = 0;
        jumpsNumber[0] = 0;
        while (true) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (jumpsNumber[i] == step) {
                    count++;
                    int temp = i + jumpLengths[i];
                    if (temp >= n)
                    {
                        System.out.println(step + 1);
                        return;
                    }
                    else {
                        while (temp > 0) {
                            int temp1 = temp - slidingLengths[temp];
                            if (jumpsNumber[temp1] == -1) {
                                jumpsNumber[temp1] = step + 1;
                            }
                            temp--;
                        }
                    }
                }
            }
            if (count == 0) {
                System.out.println(-1);
                return;
            }
            step++;
        }
    }
}