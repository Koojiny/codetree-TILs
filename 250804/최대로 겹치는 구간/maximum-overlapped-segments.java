import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] line = new int[200];
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) + 100;
            int b = Integer.parseInt(st.nextToken()) + 100;

            for (int j = a; j < b; j++) {
                line[j]++;
            }
        }

        int max = 0;
        for (int i = 0; i < line.length; i++) {
            max = Math.max(max, line[i]);
        }
        
        System.out.print(max);
    }
}