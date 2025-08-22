import java.util.*;
import java.io.*;

public class Main {
    public static int N;
    public static int[][] board;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        for (int i = 0; i <= N - 2; i++) { // 첫번째 격자 행 : 0부터 N - 2까지
            for (int j = 0; j <= N - 3; j++) { // 첫번째 격자 열 : 0부터 N - 3까지
                for (int k = i + 1; k <= N - 1; k++) { // 두 번째 격자 행 : i + 1부터 N - 1까지
                    for (int l = 0; l <= N - 3; l++) { // 두 번째 격자 열 : 첫번째와 동일
                        int first = board[i][j] + board[i][j + 1] + board[i][j + 2];
                        int second = board[k][l] + board[k][l + 1] + board[k][l + 2];
                        max = Math.max(max, first + second);
                    }
                }
            }
        }

        if (N >= 6) { // N이 6보다 큰 경우에는 한 줄에 있는 숫자가 더 클 수도 있음
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= N - 6; j++) { // 첫번째 격자
                    for (int k = j + 3; k <= N - 3; k++) {
                        int sum = board[i][j] + board[i][j + 1] + board[i][j + 2] + board[i][k] + board[i][k + 1] + board[i][k + 2];
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);
    }
}