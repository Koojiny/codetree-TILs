import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max_R = 1000000;
        // int max_R = 100;
        int[] a = new int[max_R + 1];
        int[] b = new int[max_R + 1];
        int curTime = 0;
        int curIdx = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            while (t-- > 0) {
                curTime += v;
                a[++curIdx] = curTime;
            }
        }
        int lenA = curIdx;

        curIdx = 0;
        curTime = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            while (t-- > 0) {
                curTime += v;
                b[++curIdx] = curTime;
            }
        }
        int lenB = curIdx;

        int time = Math.min(lenA, lenB);
        int leader = 0; // 0 : 없음, 1 : A, 2 : B
        int cnt = 0;
        for (int i = 1; i <= time; i++) {
            int now;
            if (a[i] > b[i]) now = 1;
            else if (a[i] < b[i]) now = 2;
            else now = leader;

            if (leader != 0 && now != leader) cnt++;
            
            leader = now;
        }

        System.out.println(cnt);
    }
}