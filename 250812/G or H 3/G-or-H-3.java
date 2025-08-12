import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int maxSize = 100;
        char[] line = new char[maxSize + 1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            char alphabet = st.nextToken().charAt(0);

            line[num] = alphabet;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < maxSize + 1 - k; i++) {
            int sum = 0;
            for (int j = 0; j <= k; j++) {
                if (line[i + j] == 'G') sum += 1;
                else if (line[i + j] == 'H') sum += 2;
                
            }
            // System.out.println(i + " : " + sum);

            if (sum > max) max = sum;
        }

        // System.out.println(Arrays.toString(line));
        System.out.println(max);
    }
}