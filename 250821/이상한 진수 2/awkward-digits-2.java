import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int len = s.length();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        int max = 0;
        for (int i = 1; i < len; i++) {
            int num = 0;
            arr[i] = 1 - arr[i];
            for (int j = 0; j < len; j++) {
                num += Math.pow(2, len - 1 - j) * arr[j];
                // System.out.println("j= " + j + " "+ Math.pow(2, len - 1 - j) + " " + arr[j] + " " + num);
            }
            max = Math.max(max, num);
            
            arr[i] = 1 - arr[i];
        }

        System.out.println(max);
    }
}