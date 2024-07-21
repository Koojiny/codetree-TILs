import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int a = 1; a <= n; a++){
            if (a % 2 == 0 || a % 3 == 0) System.out.print(1 + " ");
            else System.out.print(0 + " ");
        }
    }
}