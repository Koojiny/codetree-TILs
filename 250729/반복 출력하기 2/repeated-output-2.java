import java.util.*;
import java.io.*;

public class Main {
    public static int M, N, result;
    public static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        printHello(n);
    }

    public static void printHello(int n) {
        if (n == 0) return;
        
        printHello(n - 1);
        
        System.out.println("HelloWorld");
    }
}