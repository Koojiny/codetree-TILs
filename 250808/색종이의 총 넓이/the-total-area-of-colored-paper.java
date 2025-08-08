import java.util.*;
import java.io.*;

public class Main {
    public static int[][] board;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int size = 8;
        int offset = 100;
        board = new int[offset * 2 + 1][offset * 2 + 1];

        // 1. n 장의 색종이만큼 평면에 칠하기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + size; j++) {
                for (int k = y; k < y + size; k++) {
                    board[j][k] = 1;
                }
            }
        }

        int area = 0;
        for (int j = 0; j < offset * 2 + 1; j++) {
            for (int k = 0; k < offset * 2 + 1; k++) {
                if (board[j][k] == 1) area++;
            }
        }

        System.out.println(area);
    }
}