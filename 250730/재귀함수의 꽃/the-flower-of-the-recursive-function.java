import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        printN(N);
    }

    public static void printN(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printN(n - 1);
        System.out.print(n + " ");
    }
}