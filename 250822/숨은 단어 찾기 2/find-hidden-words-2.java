import java.util.*;
import java.io.*;

public class Main {
    public static char[][] board;
    public static int n, m, cnt;
    public static int[] dx = {0, 1, 1,  1,  0, -1, -1, -1}; // 동, 동남, 남 으로 시계방향 8방향
    public static int[] dy = {1, 1, 0, -1, -1, -1,  0,  1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        // N x M 돌면서 LEE 개수 세기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'L') {
                    checkString(i, j);
                }
            }
        }

        System.out.println(cnt);
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;    
    }

    public static void checkString(int x, int y) {
        // L좌표에서 8개의 방향으로 진행
        for (int dir = 0; dir < 8; dir++) {
            // 현재 좌표 설정
            int curX = x;
            int curY = y;
            
            // 2회 반복하여 LEE 판별
            String s = "L";
            for (int i = 0; i < 2; i++) {
                curX += dx[dir];
                curY += dy[dir];
                if (!inRange(curX, curY)) break; // 격자를 나간 경우 탈출
                if (board[curX][curY] != 'E') break; // E 가 아닌 경우 탈출

                s += board[curX][curY];
            }

            if (s.equals("LEE")) cnt++;
        }
    }
}