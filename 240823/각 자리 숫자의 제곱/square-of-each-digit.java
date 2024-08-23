import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(powNum(n));
    }

    public static int powNum(int n) {
        if (n < 10) return n * n;

        return powNum(n / 10) + (n % 10) * ( n % 10);
    }
}