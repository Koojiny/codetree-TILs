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
        int idx = 0;
        int xCnt = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.startsWith(t)) {
                sArr[idx] = s;
            } else {
                sArr[idx] = "";
                xCnt++;
            }
            idx++;
        }
        Arrays.sort(sArr);        

        System.out.print(sArr[xCnt + k - 1]);
    }
}