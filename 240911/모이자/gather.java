import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //System.out.println(Arrays.toString(arr));

        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int tmpSum = 0;
            for (int j = 0; j < n; j++) {
                tmpSum += Math.abs(j - i) * arr[j];
            }
            //System.out.println(tmpSum);
            if (minSum > tmpSum) minSum = tmpSum;
        }

        System.out.print(minSum);
    }
}