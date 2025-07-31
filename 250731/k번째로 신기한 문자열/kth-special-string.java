import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String t = st.nextToken();

        String[] sArr = new String[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.startsWith(t)) {
                sArr[cnt++] = s;
            }
        }
        Arrays.sort(sArr, 0, cnt);        

        System.out.print(sArr[k - 1]);
    }
}