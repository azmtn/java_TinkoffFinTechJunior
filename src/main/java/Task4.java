import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        long[][] chessField = new long[n+1][m+1];
        chessField[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= m; j++) {
                chessField[i][j] = chessField[i - 1][j - 2] + chessField[i - 2][j - 1];
            }
        }
        System.out.println(chessField[n][m]);
    }
}
