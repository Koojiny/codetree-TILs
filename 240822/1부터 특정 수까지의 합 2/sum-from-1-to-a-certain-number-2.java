import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.print(sumN(n));
    }

    public static int sumN(int n) {
        if (n == 1) return 1;

        return sumN(n - 1) + n;
    }
}