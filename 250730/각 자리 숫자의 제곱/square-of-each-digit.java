import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(sumPow(N));
    }

    public static int sumPow(int n) {
        if (n < 10) return n * n;
        int now = n % 10;
        return sumPow(n / 10) + now * now;
    }
}