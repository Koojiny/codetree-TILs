import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int cnt = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(st.nextToken());
            if (i >= 1 && now > T) {
                cnt++;
            } else {
                if (now > T) cnt = 1;
                else cnt = 0;
            }

            if (cnt > max) max = cnt;
        }

        System.out.print(max);
    }
}