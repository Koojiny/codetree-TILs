import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        printString(n);
    }

    public static void printString(int n) {
        if (n == 0) return;

        System.out.println("HelloWorld");
        printString(n - 1);
    }
}