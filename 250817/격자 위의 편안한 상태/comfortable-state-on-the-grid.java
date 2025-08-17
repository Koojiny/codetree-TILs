import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][n];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int curX = r - 1;
            int curY = c - 1;
            board[curX][curY] = 1;
            
            int cnt = 0;
            for (int k = 0; k < 4; k++) {
                int nx = curX + dx[k];
                int ny = curY + dy[k];

                if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                    if (board[nx][ny] == 1) cnt++;
                }
            }

            if (cnt == 3) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}