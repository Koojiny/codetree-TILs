import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int x = 0;
        int y = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            char dir = st.nextToken().charAt(0);
            int dis = Integer.parseInt(st.nextToken());

            if (dir == 'E') {
                x += dx[0] * dis;
                y += dy[0] * dis;
            } else if (dir == 'W') {
                x += dx[1] * dis;
                y += dy[1] * dis;
            } else if (dir == 'N') {
                x += dx[2] * dis;
                y += dy[2] * dis;
            } else {
                x += dx[3] * dis;
                y += dy[3] * dis;
            }
        }

        System.out.println(x + " " + y);
    }
}