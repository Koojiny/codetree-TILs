import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // int size = 1000000;
        int size = 30;
        int[] a = new int[size + 1];
        int[] b = new int[size + 1];

        int curIdx = 0;
        int curPos = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            while(t-- > 0) {
                curPos += v;
                a[++curIdx] = curPos;
            }
        }
        int lenA = curIdx;

        curIdx = 0;
        curPos = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            while(t-- > 0) {
                curPos += v;
                b[++curIdx] = curPos;
            }
        }
        int lenB = curIdx;

        int totalTime = Math.min(lenA, lenB);
        int first = 0;
        int cnt = 0;
        // 선두 - 0: 없음, 1: a, 2: b, 3: 둘 다
        for (int i = 1; i <= totalTime; i++) {
            int now = 0;

            if (a[i] > b[i]) now = 1;
            else if (a[i] < b[i]) now = 2;
            else if (a[i] == b[i]) now = 3;

            if (first != now) {
                cnt++;
                first = now;
            }
        }

        System.out.println(cnt);
    }
}