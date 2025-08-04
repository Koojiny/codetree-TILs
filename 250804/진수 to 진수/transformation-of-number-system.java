import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String n = br.readLine();

        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            result = result * a + (n.charAt(i) - '0');
        }

        System.out.println(changeN(result, b));
    }

    public static String changeN(int n, int b) {
        if (n == 0) return "0";

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.insert(0, n % b);
            n /= b;
        }

        return sb.toString();
    }
}