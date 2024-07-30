import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;
        
        for (int i = a; a <= b; i++) {
            if (cnt369(i)) cnt++;
        }
        System.out.print(cnt);
    }

    static boolean cnt369(int n) {
        if (n % 3 == 0) return true;
        else {
            char[] cArr = String.valueOf(n).toCharArray();
            for (char c : cArr) {
                if (c == '3' || c == '6' || c == '9') return true;
            }
        }       
        return false;
    }
}