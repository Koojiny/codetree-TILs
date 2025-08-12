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
        int[] first = new int[time + 1];
        int firstPerson = a[1] > b[1]? 1 : 2;
        for (int i = 1; i <= time; i++) {
            if (a[i] > b[i]) {
                firstPerson = 1;
                first[i] = firstPerson;
            } else if (a[i] < b[i]) {
                firstPerson = 2;
                first[i] = firstPerson;
            } else {
                first[i] = firstPerson;
            }
        }

        int cnt = 0;
        for (int i = 2; i < first.length; i++) {
            if (first[i - 1] != first[i]) cnt++;
        }

        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));
        // System.out.println(Arrays.toString(first));
        System.out.println(cnt);
    }
}