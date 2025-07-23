import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        boolean found = false;

        for (int i = 0; i <= n1 - n2; i++) {
            boolean match = true;
            for (int j = 0; j < n2; j++) {
                if (arr1[i + j] != arr2[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Yes" : "No");        
    }
}