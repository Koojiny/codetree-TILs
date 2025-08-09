import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        boolean flag = arr[0] > 0;

        int cnt = 1;
        int max = 1;
        for (int i = 1; i < n; i++) {
            boolean nflag = arr[i] > 0;
            if (flag == nflag) {
                cnt++;
            } else {
                cnt = 1;
                flag = nflag;
            }

            if (cnt > max) max = cnt;
        }

        System.out.println(max);
    }
}