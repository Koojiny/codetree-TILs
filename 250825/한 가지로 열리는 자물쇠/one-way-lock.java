import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    int diffA = Math.abs(a - i);
                    int diffB = Math.abs(b - j);
                    int diffC = Math.abs(c - k);

                    if (diffA <= 2 || diffB <= 2 || diffC <= 2) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}