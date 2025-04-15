import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.print((n * m) / gcd(n, m));
    }

    public static int gcd(int n, int m) {
        if (n % m == 0) return m;
        return gcd(m, n % m);
    }
}