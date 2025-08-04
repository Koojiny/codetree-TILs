import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int len = n.length();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(n.substring(i, i + 1));
        }

        int result = 0;
        for (int i = 0; i < len; i++) {
            result += arr[len - i - 1] * Math.pow(2, i);
        }

        System.out.println(result);
    }
}