import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if(isRightNum(i)) cnt++;
        }

        System.out.print(cnt);
    }

    public static boolean isRightNum(int n) {
        if (n % 2 != 0 && n % 10 != 5 && (n % 3 != 0 || n % 9 == 0)) return true;
        else return false;
    }
}