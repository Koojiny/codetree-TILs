import java.util.*;
import java.io.*;

public class Main {
    public static final int OFFSET = 1000;
    public static final int SIZE = OFFSET * 2 + 1;
    public static int[][] board;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        board = new int[SIZE][SIZE];

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(st.nextToken()) + OFFSET;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    board[j][k] = i + 1;
                }
            }
        }

        // for (int j = 0; j < SIZE; j++) {
        //     for (int k = 0; k < SIZE; k++) {
        //         System.out.print(board[j][k] + " ");
        //     }
        //     System.out.println();
        // }

        // x, y 최대 최소 위치
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if (board[x][y] == 1) {
                    if (x < minX) minX = x;
                    if (x > maxX) maxX = x;
                    if (y < minY) minY = y;
                    if (y > maxY) maxY = y;
                }
            }
        }

        if (minx == Integer.MAX_VALUE) return 0;

        System.out.println((maxX - minX + 1) * (maxY - minY + 1));
    }
}