import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] aArr = new int[n];
        int[] bArr = new int[n];
        boolean flag = true;

         st = new StringTokenizer(br.readLine());
         for (int i = 0; i < n; i++) {
            aArr[i] = Integer.parseInt(st.nextToken());
         }

         st = new StringTokenizer(br.readLine());
         for (int i = 0; i < n; i++) {
            bArr[i] = Integer.parseInt(st.nextToken());
         }

         Arrays.sort(aArr);
         Arrays.sort(bArr);

         for (int i = 0; i < n; i++) {
            if (aArr[i] == bArr[i]) continue;
            else {
                System.out.print("No");
                flag = false;
                break;
            }
         }
         if (flag == true) System.out.print("Yes");
    }
}