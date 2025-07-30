import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.print(suyeol(N));
    }

    public static int suyeol(int n) {
        if (n == 1) return 2;
        if (n == 2) return 4;
        
        return suyeol(n - 1) * suyeol(n - 2) % 100;
    }
}