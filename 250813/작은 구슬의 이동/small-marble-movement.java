import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][n];
        int x, y;
        char cDir;
        int dir;
        int[] dx = {0, 1, -1, 0}; // 우, 하, 상, 좌
        int[] dy = {1, 0, 0, -1};

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken()) - 1;
        y = Integer.parseInt(st.nextToken()) - 1;
        cDir = st.nextToken().charAt(0);
        
        if (cDir == 'U') dir = 2;
        else if (cDir == 'D') dir = 1;
        else if (cDir == 'R') dir = 0;
        else dir = 3;

        for (int i = 0; i < t; i++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                x = nx;
                y = ny;
            } else {
                dir = 3 - dir;
            }
        }

        System.out.println((x + 1) + " " + (y + 1));
    }
}