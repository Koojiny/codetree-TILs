import java.util.*;
import java.io.*;

public class Main {
    public static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        upN(1);
        System.out.println();
        downN(N);
    }

    public static void upN(int n) {
        if (n > N) return;
        System.out.print(n + " ");
        upN(n + 1);
    }

    public static void downN(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        downN(n - 1);
    }
}