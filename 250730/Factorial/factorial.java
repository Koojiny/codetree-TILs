import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(fac(N));
    }

    public static int fac(int n) {
        if (n <= 1) return 1;

        return fac(n - 1) * n;
    }
}