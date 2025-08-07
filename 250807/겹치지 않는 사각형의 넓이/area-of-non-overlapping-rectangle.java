import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] board = new int[2001][2001];
        int[] square = new int[2];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) + 1000;
            int y1 = Integer.parseInt(st.nextToken()) + 1000;
            int x2 = Integer.parseInt(st.nextToken()) + 1000;
            int y2 = Integer.parseInt(st.nextToken()) + 1000;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    board[j][k] = i + 1;
                }
            }
        }
        
        int cnt = 0;
        for (int j = 0; j < 2001; j++) {
            for (int k = 0; k < 2001; k++) {
                if (board[j][k] == 1 || board[j][k] == 2) cnt++;
            }
        }

        System.out.println(cnt);
    }
}