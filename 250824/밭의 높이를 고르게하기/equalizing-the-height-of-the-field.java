import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[] ground = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ground[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n - t; i++) {
            int sumCost = 0;
            for (int j = i; j < i + t; j++) {
                int curSize = ground[j];
                if (curSize > h) { // h 높이보다 큰 경우 같아질 때까지 낮춤
                    while (curSize > h) {
                        curSize--;
                        sumCost++;
                    }
                } else if (curSize < h) { // h 높이보다 낮은 경우 올림
                    while (curSize < h) {
                        curSize++;
                        sumCost++;
                    }                    
                } else {
                    continue;
                }
            }
            // System.out.println("i = " + i + ", sumCost = " + sumCost);

            min = Math.min(min, sumCost);
        }

        System.out.println(min);
    }
}