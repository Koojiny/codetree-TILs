import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(sum(N, 0));
    }

    public static int sum(int n, int cnt) {
        if (n == 1) return cnt;

        if (n % 2 == 0) return sum(n / 2, cnt + 1);
        else return sum(n / 3, cnt + 1);
    }
}