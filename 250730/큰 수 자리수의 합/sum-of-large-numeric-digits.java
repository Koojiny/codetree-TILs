import java.util.*;
import java.io.*;

public class Main {
    public static int max;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            num *= Integer.parseInt(st.nextToken());
        }

        System.out.print(sum(num));
    }

    public static int sum(int n) {
        if (n < 10) return n;

        return sum(n / 10) + n % 10;
    }
}