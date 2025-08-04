import java.util.*;
import java.io.*;

public class Main {
    public static int curIdx;
    public static int[] line;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        line = new int[1001];
        curIdx = 501;
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);

            changeLocation(x, dir);
        }

        int cnt = 0;
        for (int i = 0; i < line.length; i++) {
            if (line[i] >= 2) {
                cnt++;
                // System.out.println(i + " : " + line[i]);
            }
        }

        System.out.println(cnt);
    }

    public static void changeLocation(int x, int dir) {
        if (dir == 'L') {
            for (int i = curIdx - 1; i >= curIdx - x; i--) {
                line[i]++;
            }
            curIdx -= x;
        } else if (dir == 'R') {            
            for (int i = curIdx; i < curIdx + x; i++) {
                line[i]++;
            }
            curIdx += x;
        }
    }
}