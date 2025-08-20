import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int len = arr.length;

        int cnt = 0;
        boolean flag = false;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == '(') flag = true;
            for (int j = i + 1; j < len; j++) {
                if (flag && arr[j] == ')') cnt++;
            }
            flag = false;
            // System.out.println(i + "번째 : "+ cnt);
        }

        System.out.println(cnt);
    }
}