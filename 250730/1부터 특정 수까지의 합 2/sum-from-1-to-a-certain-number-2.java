import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = sumAll(N);
        System.out.println(result);
    }

    public static int sumAll(int n) {
        if (n == 1) return 1;
        return sumAll(n - 1) + n;
    }
}