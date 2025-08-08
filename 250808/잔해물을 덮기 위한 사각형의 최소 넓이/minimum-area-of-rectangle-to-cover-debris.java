import java.util.*;
import java.io.*;

public class Main {
    public static int OFFSET;
    public static int[][] board;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        OFFSET = 1000;
        board = new int[OFFSET * 2 + 1][OFFSET * 2 + 1];

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

        int maxGaro = 0;
        int maxSero = 0;
        // for (int j = 0; j < OFFSET * 2 + 1; j++) {
        //     for (int k = 0; k < OFFSET * 2 + 1; k++) {
        //         System.out.print(board[j][k] + " ");
        //     }
        //     System.out.println();
        // }

        // 가로 최대 길이
        for (int j = 0; j < OFFSET * 2 + 1; j++) {
            int cnt = 0;
            for (int k = 0; k < OFFSET * 2 + 1; k++) {
                if (board[j][k] == 1) cnt++;
            }
            if (cnt > maxGaro) maxGaro = cnt;
        }

        // 세로 최대 길이
        for (int k = 0; k < OFFSET * 2 + 1; k++) {
            int cnt = 0;
            for (int j = 0; j < OFFSET * 2 + 1; j++) {
                if (board[j][k] == 1) cnt++;
            }
            if (cnt > maxSero) maxSero = cnt;
        }

        System.out.println(maxGaro * maxSero);
    }
}