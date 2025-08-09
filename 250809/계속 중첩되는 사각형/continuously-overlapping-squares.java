import java.util.*;
import java.io.*;

public class Main {
    public static final int OFFSET = 100;
    public static final int SIZE = OFFSET * 2 + 1;
    public static int[][] board = new int[SIZE][SIZE];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(st.nextToken()) + OFFSET;

            // 빨간색 : 1, 파란색 : 2
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    board[j][k] = i % 2 + 1;
                }
            }
        }

        int cnt = 0;
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if (board[x][y] == 2) cnt++;
            }
        }

        System.out.println(cnt);
    }
}