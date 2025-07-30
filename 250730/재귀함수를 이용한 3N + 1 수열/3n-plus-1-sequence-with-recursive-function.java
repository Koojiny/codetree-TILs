import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.print(countN(N, 0));
    }

    public static int countN(int n, int count) {
        if (n == 1) return count;

        if (n % 2 == 0) return countN(n / 2, count + 1);
        else return countN(n * 3 + 1, count + 1);
    }
}