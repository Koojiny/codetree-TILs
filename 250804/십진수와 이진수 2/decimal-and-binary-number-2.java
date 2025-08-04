import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int len = n.length();

        int result = 0;
        for (int i = 0; i < len; i++) {
            result += Integer.parseInt(n.substring(i, i+ 1)) * Math.pow(2, len - i - 1);
        }
        
        System.out.println(changeNum2(result * 17));        
    }

    public static String changeNum2(int n) {
        String s = "";
        int[] arr = new int[20];
        int cnt = 0;

        while (true) {
            if (n < 2) {
                arr[cnt++] = n;
                break;
            }
            arr[cnt++] = n % 2;
            n /= 2;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            s += arr[i];
        }

        return s;
    }
}