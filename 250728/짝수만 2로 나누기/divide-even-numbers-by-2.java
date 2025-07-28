import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        change(arr);
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) arr[i] /= 2;
        }
    }
}