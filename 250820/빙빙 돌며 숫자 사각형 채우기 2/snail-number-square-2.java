import java.util.*;
import java.io.*;

public class Main {
    public static int[][] arr;
    public static int n, m, num;
    public static int x, y, dir;
    public static int[] dx = {0, 1, 0, -1}; // 동 남 서 북
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        x = 0;
        y = 0;
        dir = 1;
        num = 1;

        move(x, y);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    public static void move(int x, int y) {
            arr[x][y] = num;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (!inRange(nx, ny) || arr[nx][ny] != 0) {
                dir = (dir - 1 + 4) % 4;
            }

            x = x + dx[dir];
            y = y + dy[dir];
            num++;
            if (!inRange(x, y) || arr[x][y] != 0) return;
            
            move(x, y);
    }
}