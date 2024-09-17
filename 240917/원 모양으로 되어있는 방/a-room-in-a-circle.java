import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //System.out.println(Arrays.toString(arr));

        int minDis = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int tmpDis = 0;
            for (int j = 1; j <= n; j++) {
                if (j - i < 0) {
                    tmpDis += (j - i + n) * arr[j];
                } else {
                    tmpDis += (j - i) * arr[j];
                }
            }

            minDis = Math.min(minDis, tmpDis);
        }
        System.out.println(minDis);
    }
}