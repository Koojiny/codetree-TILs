import java.util.*;
import java.io.*;

public class Main {
    public static int[] a, b;
    public static int curIdx = 0;
    public static int curNum = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        a = new int[10000001];
        b = new int[10000001];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            char d = st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());

            move(d, t, a);
        }
        int lenA = curIdx;

        curIdx = 0;
        curNum = 0;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            char d = st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());

            move(d, t, b);
        }
        int lenB = curIdx;

        int time = Math.min(lenA, lenB);
        for (int i = 1; i <= time; i++) {
            if (a[i] == b[i]) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }

    public static void move(char dir, int t, int[] arr) {
        if (dir == 'L') {
            while (t > 0) {
                arr[++curIdx] = --curNum;
                t--;
            }
        } else {
            while (t > 0) {
                arr[++curIdx] = ++curNum;
                t--;
            }            
        }
    }
}