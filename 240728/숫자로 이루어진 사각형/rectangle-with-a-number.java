import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        printRec(n, n);
    }

    public static void printRec(int n, int m) {
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a + " ");
                if (a == 9) a = 0;
                a++;
            }
            System.out.println();
        }
    }
}