import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.print(sum(N));
    }

    public static int sum(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        return sum(n - 2) + n;
    }
}