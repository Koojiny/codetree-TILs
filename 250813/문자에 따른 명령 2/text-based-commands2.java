import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command = br.readLine();

        int[] dx = {1, 0, -1, 0}; // 동 -> 남 -> 서 -> 북 시계방향
        int[] dy = {0, -1, 0, 1};
        int x = 0;
        int y = 0;
        int dir = 3; // 시작 방향        

        for (int i = 0; i < command.length(); i++) {
            char cmd = command.charAt(i);

            if (cmd == 'L') {
                dir = (dir - 1 + 4) % 4;
            } else if (cmd == 'R') {
                dir = (dir + 1) % 4;
            } else {
                x += dx[dir];
                y += dy[dir];
            }
        }

        System.out.println(x + " " + y);
    }
}