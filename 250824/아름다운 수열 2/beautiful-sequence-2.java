import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        int[] b = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for (int i = 0; i <= n - m; i++) { // 수열 A를 모두 돌면서 M개를 모두 비교
            int cnt = 0;
            for (int j = i; j < i + m; j++) { // 현재 위치 i에서 M개를 비교
                int cur = a[j];
                boolean[] visit = new boolean[m];

                for (int k = 0; k < m; k++) {
                    if (cur == b[k] && !visit[k]) {
                        visit[k] = true;
                        cnt++;
                        // System.out.println("j = " + j + " k = " + k + " ");
                        // System.out.println(Arrays.toString(visit));
                        break;
                    }
                }
            }
            // System.out.println();

            if (cnt == m) answer++;
        }

        System.out.println(answer);
    }
}