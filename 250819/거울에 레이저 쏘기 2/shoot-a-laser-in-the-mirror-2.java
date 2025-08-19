import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static char[][] board;
    public static int[] dx = {1, 0, -1, 0}; // 남 서 북 동
    public static int[] dy = {0, -1, 0, 1};

    public static int x, y, moveDir;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new char[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = s.charAt(j);
            }
        }
        
        int k = Integer.parseInt(br.readLine());
        // 1. 시작 위치와 방향
        start(k);

        // (x,y)에서 moverDir 방향으로 시작하여 시뮬레이션 시작
        int moveNum = simulate();

        System.out.println(moveNum);
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    // 시작 위치와 방향 설정
    public static void start(int num) {
        if (num <= n) { // 위쪽
            x = 0;
            y = num - 1;
            moveDir = 0;
        } else if (num <= 2 * n) { // 오른쪽
            x = num - n - 1;
            y = n - 1;
            moveDir = 1;
        } else if (num <= 3 * n) { // 아래쪽
            x = n - 1;
            y = 3 * n - num;
            moveDir = 2;
        } else { // 왼쪽
            x = 4 * n - num;
            y = 0;
            moveDir = 3;
        }
    }

    // 0:남 1:서 2:북 3:동
    public static int simulate() {
        int moveNum = 0;
        while (inRange(x, y)) {
            // 0 <-> 1, 2 <-> 3
            if (board[x][y] == '/') {
                if (moveDir == 0) moveDir = 1;
                else if (moveDir == 1) moveDir = 0;
                else if (moveDir == 2) moveDir = 3;
                else if (moveDir == 3) moveDir = 2;
                
                move(moveDir);
            } else { // 0 <-> 3, 1 <-> 2
                move(3 - moveDir);
            }

            moveNum++;
        }

        return moveNum;
    }

    public static void move(int nextDir) {
        x += dx[nextDir];
        y += dy[nextDir];
        moveDir = nextDir;
    }
}