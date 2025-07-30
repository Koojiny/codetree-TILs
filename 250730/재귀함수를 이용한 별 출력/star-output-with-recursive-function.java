import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        printStar(n);
    }

    public static void printStar(int a) {
        if (a == 0) return;

        printStar(a - 1);
        
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}