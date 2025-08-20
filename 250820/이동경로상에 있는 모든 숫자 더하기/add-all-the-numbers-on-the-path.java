import java.util.*;
import java.io.*;

public class Main {
    public static int N, T;
    public static int[][] arr;
    public static char[] command;
    public static int x, y, dir, cnt;
    public static int[] dx = {0, 1, 0, -1}; // 동 남 서 북
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        command = br.readLine().toCharArray();
        
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        x = N / 2;
        y = N / 2;
        dir = 3;
        cnt = arr[x][y];

        for (int i = 0; i < T; i++) {
            if (command[i] == 'L') {
                dir = (dir + 3) % 4;
            } else if (command[i] == 'R') {
                dir = (dir + 1) % 4;
            } else {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (!inRange(nx, ny)) continue;
                else {
                    x = nx;
                    y = ny;
                    cnt += arr[nx][ny];
                }
            }

            // System.out.println(i+1 + "번째 : " + x + " " + y + " " + arr[x][y] + " " + cnt);
        }

        System.out.println(cnt);
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }
}