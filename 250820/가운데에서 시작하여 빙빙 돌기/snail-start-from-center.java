import java.util.*;
import java.io.*;

public class Main {
    public static int n, x, y, dir, num;
    public static int[][] arr;
    public static int[] dx = {0, -1, 0, 1}; // 서 북 동 남
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        x = n - 1;
        y = n - 1;
        dir = 0;
        num = n * n;

        move(x, y);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void move(int x, int y) {
        arr[x][y] = num--;

        int nx = x + dx[dir];
        int ny = y + dy[dir];

        if (!inRange(nx, ny) || arr[nx][ny] != 0) {
            dir = (dir + 1) % 4;
            nx = x + dx[dir];
            ny = y + dy[dir];
        }

        if (!inRange(nx, ny) || arr[nx][ny] != 0) return;

        move(nx, ny);
    }
}