import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.print(powNum(a, b));
    }

    public static int powNum(int a, int b) {
        int n = 1;
        for (int i = 0; i < b; i++) {
            n *= a;
        }

        return n;
    }
}