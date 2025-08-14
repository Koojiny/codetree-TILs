import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command = br.readLine();
        int len = command.length();
        int[] dx = {0, 1, 0, -1}; // 동 남 서 북
        int[] dy = {1, 0, -1, 0};
        int dir = 3; // 북쪽 시작
        int x = 0;
        int y = 0;
        int time = 0;

        for (int i = 0; i < len; i++) {
            char cmd = command.charAt(i);
            if (cmd == 'L') {
                dir = (dir - 1 + 4) % 4;
                time++;
            } else if (cmd == 'R') {
                dir = (dir + 1) % 4;
                time++;
            } else if (cmd == 'F') {
                x = x + dx[dir];
                y = y + dy[dir];
                time++;
                
                if (x == 0 && y == 0) {
                    System.out.println(time);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}