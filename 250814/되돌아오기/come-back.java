import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int size = 1000;
        int[][] board = new int[size][size];
        int[] dx = {0, 1, 0, -1}; // 동, 남, 서, 북
        int[] dy = {1, 0, -1, 0};
        int dir = 0;
        int x = 0;
        int y = 0;
        int ans = -1;
        int time = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            char cDir = st.nextToken().charAt(0);
            int dist = Integer.parseInt(st.nextToken());

            if (cDir == 'E') dir = 0;
            else if (cDir == 'S') dir = 1;
            else if (cDir == 'W') dir = 2;
            else if (cDir == 'N') dir = 3;

            while (dist-- > 0) {
                if (i != 0 && x == 0 && y == 0) {
                    ans = time;
                    break;
                }
                x = x + dx[dir];
                y = y + dy[dir];
                time++;
                // System.out.println(time + " : " + x + ", " + y);
            }
        }

        System.out.println(ans);
    }
}