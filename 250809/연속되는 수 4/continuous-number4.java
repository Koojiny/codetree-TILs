import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        int max = 0;
        int prev = Integer.parseInt(br.readLine());
        for (int i = 1; i < n; i++) {
            int now = Integer.parseInt(br.readLine());

            if (prev < now) {
                cnt++;
            } else {
                cnt = 1;
            }
            prev = now;

            if (cnt > max) max = cnt;
        }

        System.out.println(max);
    }
}