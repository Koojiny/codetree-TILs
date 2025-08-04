import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1000];
        int cnt = 0;

        while (true) {
            if (n < 2) {
                arr[cnt++] = n;
                break;
            }
            
            arr[cnt++] = n % 2;
            n = n / 2;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}