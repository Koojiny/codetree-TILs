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
        int len = offset * 2 + 1;
        
        board = new int[len][len];

        // 1. n 장의 색종이만큼 평면에 칠하기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) + offset;
            int y = Integer.parseInt(st.nextToken()) + offset;

            for (int j = x; j < x + size; j++) {
                for (int k = y; k < y + size; k++) {
                    board[j][k] = 1;
                }
            }
        }

        // 2. 칠해진 부분 합산
        int area = 0;
        for (int j = 0; j < len; j++) {
            for (int k = 0; k < len; k++) {
                if (board[j][k] == 1) area++;
            }
        }

        System.out.println(area);
    }
}