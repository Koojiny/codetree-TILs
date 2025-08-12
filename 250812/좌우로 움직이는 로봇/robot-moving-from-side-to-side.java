import java.util.*;
import java.io.*;

public class Main {
    public static final int SIZE = 1000000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] a = new int[SIZE];
        int[] b = new int[SIZE];

        int curTime = 1;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            while (t-- > 0) {
                if (d == 'L') {
                    a[curTime] = a[curTime - 1] - 1;
                } else {
                    a[curTime] = a[curTime - 1] + 1;
                }
                curTime++;
            }
        }
        int lenA = curTime - 1;

        curTime = 1;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            while (t-- > 0) {
                if (d == 'L') {
                    b[curTime] = b[curTime - 1] - 1;
                } else {
                    b[curTime] = b[curTime - 1] + 1;
                }
                curTime++;
            }
        }
        int lenB = curTime - 1;

        int cnt = 0;
        int time = Math.min(lenA, lenB)l
        for (int i = 1; i <= time; i++) {
            if (a[i - 1] != b[i - 1] && a[i] == b[i]) cnt++;
        }

        System.out.println(cnt);
    }
}